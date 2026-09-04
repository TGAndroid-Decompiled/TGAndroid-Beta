package x8;
public abstract class j {
    public static final com.google.android.gms.common.api.e f49283a = new com.google.android.gms.common.api.e("Wearable.API", new a8.d(18), new Object());
    public static final k6.c[] f49284b = {new k6.c("app_client", 4), new k6.c("carrier_auth", 1), new k6.c("wear3_oem_companion", 1), new k6.c("wear_consent", 2), new k6.c("wear_consent_recordoptin", 1), new k6.c("wear_consent_supervised", 1), new k6.c("wear_fast_pair_account_key_sync", 1), new k6.c("wear_get_related_configs", 1), new k6.c("wear_get_node_id", 1), new k6.c("wear_retry_connection", 1), new k6.c("wear_set_cloud_sync_setting_by_node", 1), new k6.c("wear_update_config", 1), new k6.c("wear_update_connection_retry_strategy", 1), new k6.c("wearable_services", 1)};

    public static String a(int i10) {
        switch (i10) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return i2.g.i(i10, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
