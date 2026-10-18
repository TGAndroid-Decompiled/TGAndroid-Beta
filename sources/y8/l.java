package y8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends l6.a implements x8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f15946a;
        int i10 = this.f15947b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f15948c].getString(i10, dataHolder.f6544c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f15946a;
        int i10 = this.f15947b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f15948c].getString(i10, dataHolder.f6544c.getInt("asset_id"));
    }
}
