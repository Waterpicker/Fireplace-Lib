package the_fireplace.lib.translation;

import the_fireplace.lib.config.FireplaceLibConfig;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class ModLanguageMaps {
    private static final Map<String, LanguageMap> PRIMARY_LANGUAGE_MAPS = new ConcurrentHashMap<>();
    private static final Map<String, LanguageMap> FALLBACK_LANGUAGE_MAPS = new ConcurrentHashMap<>();

    static LanguageMap getPrimaryMap(String modid) {
        return PRIMARY_LANGUAGE_MAPS.computeIfAbsent(modid, unused -> new LanguageMap(modid, FireplaceLibConfig.getInstance().getLocale()));
    }

    static LanguageMap getFallbackMap(String modid) {
        return FALLBACK_LANGUAGE_MAPS.computeIfAbsent(modid, unused -> new LanguageMap(modid, "en_us"));
    }
}
