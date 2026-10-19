package y8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends l6.a implements x8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f15945a;
        int i10 = this.f15946b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f15947c].getString(i10, dataHolder.f6541c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f15945a;
        int i10 = this.f15946b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f15947c].getString(i10, dataHolder.f6541c.getInt("asset_id"));
    }
}
