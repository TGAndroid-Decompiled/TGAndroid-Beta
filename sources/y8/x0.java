package y8;

import com.google.android.gms.common.api.Status;
public final class x0 extends a {
    public b8.e f49666b;

    @Override
    public final void q0(t0 t0Var) {
        String str;
        int i10 = t0Var.f49650a;
        switch (i10) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                str = x8.j.a(i10);
                break;
        }
        i0 i0Var = new i0(new Status(i10, str, null, null), t0Var.f49651b);
        b8.e eVar = this.f49666b;
        if (eVar != null) {
            eVar.a(i0Var);
            this.f49666b = null;
        }
    }
}
