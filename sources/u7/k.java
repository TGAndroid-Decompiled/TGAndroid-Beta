package u7;
public abstract class k {
    public static final y5.c[] f45194a = {new y5.c("name_ulr_private", 1), new y5.c("name_sleep_segment_request", 1), new y5.c("get_last_activity_feature_id", 1), new y5.c("support_context_feature_id", 1), new y5.c("get_current_location", 2), new y5.c("get_last_location_with_request", 1), new y5.c("set_mock_mode_with_callback", 1), new y5.c("set_mock_location_with_callback", 1), new y5.c("inject_location_with_callback", 1), new y5.c("location_updates_with_callback", 1), new y5.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i10) {
        if (i10 != 100) {
            if (i10 != 102) {
                if (i10 != 104) {
                    if (i10 == 105) {
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
