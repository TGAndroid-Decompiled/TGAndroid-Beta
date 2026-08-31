package q5;
public abstract class y {
    public static final y5.c f44638a;
    public static final y5.c f44639b;
    public static final y5.c f44640c;
    public static final y5.c d;
    public static final y5.c[] f44641e;

    static {
        y5.c cVar = new y5.c("client_side_logging", 1L);
        y5.c cVar2 = new y5.c("cxless_client_minimal", 1L);
        f44638a = cVar2;
        y5.c cVar3 = new y5.c("cxless_caf_control", 1L);
        y5.c cVar4 = new y5.c("module_flag_control", 1L);
        f44639b = cVar4;
        y5.c cVar5 = new y5.c("discovery_hint_supply", 1L);
        y5.c cVar6 = new y5.c("relay_casting_set_active_account", 1L);
        y5.c cVar7 = new y5.c("analytics_proto_enum_translation", 1L);
        f44640c = cVar7;
        y5.c cVar8 = new y5.c("integer_to_integer_map", 1L);
        d = cVar8;
        f44641e = new y5.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, new y5.c("relay_casting_set_remote_casting_mode", 1L), new y5.c("get_relay_access_token", 1L), new y5.c("get_cast_settings", 1L), new y5.c("set_bundle_setting", 1L), new y5.c("get_client_updated_info", 1L)};
    }

    public static String a(String str) {
        if (str != null) {
            return g0.K(new g0(0, str, null));
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }
}
