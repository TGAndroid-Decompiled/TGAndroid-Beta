package y8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends l6.a implements x8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f16008a;
        int i10 = this.f16009b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f16010c].getString(i10, dataHolder.f6553c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f16008a;
        int i10 = this.f16009b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f16010c].getString(i10, dataHolder.f6553c.getInt("asset_id"));
    }
}
