package q7;
public abstract class l {
    public static final u5.c[] f46113a = {new u5.c("name_ulr_private", 1), new u5.c("name_sleep_segment_request", 1), new u5.c("get_last_activity_feature_id", 1), new u5.c("support_context_feature_id", 1), new u5.c("get_current_location", 2), new u5.c("get_last_location_with_request", 1), new u5.c("set_mock_mode_with_callback", 1), new u5.c("set_mock_location_with_callback", 1), new u5.c("inject_location_with_callback", 1), new u5.c("location_updates_with_callback", 1), new u5.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i9) {
        if (i9 != 100) {
            if (i9 != 102) {
                if (i9 != 104) {
                    if (i9 == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }
}
