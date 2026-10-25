package z8;

import com.google.android.gms.common.data.DataHolder;
public final class m extends m6.a implements y8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f18358a;
        int i10 = this.f18359b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f18360c].getString(i10, dataHolder.f6666c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f18358a;
        int i10 = this.f18359b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f18360c].getString(i10, dataHolder.f6666c.getInt("asset_id"));
    }
}
