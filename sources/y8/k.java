package y8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Cells.r6;
public final class k extends l6.a {
    public final int d;
    public final int e;

    public k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.e = i11;
    }

    public final String toString() {
        String str;
        Object valueOf;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.f12817a;
                int i10 = this.f12818b;
                dataHolder.c(i10, "event_type");
                if (dataHolder.d[this.f12819c].getInt(i10, dataHolder.f4997c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.f12818b;
                    dataHolder.c(i11, "event_type");
                    if (dataHolder.d[this.f12819c].getInt(i11, dataHolder.f4997c.getInt("event_type")) == 2) {
                        str = "deleted";
                    } else {
                        str = "unknown";
                    }
                }
                return r6.j("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.f12818b, this.e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.f12817a;
                int i12 = this.f12818b;
                dataHolder2.c(i12, "data");
                byte[] blob = dataHolder2.d[this.f12819c].getBlob(i12, dataHolder2.f4997c.getInt("data"));
                int i13 = this.e;
                HashMap hashMap = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    l6.a aVar = new l6.a(dataHolder2, this.f12818b + i14);
                    DataHolder dataHolder3 = aVar.f12817a;
                    int i15 = aVar.f12818b;
                    dataHolder3.c(i15, "asset_key");
                    if (dataHolder3.d[aVar.f12819c].getString(i15, dataHolder3.f4997c.getInt("asset_key")) != null) {
                        int i16 = aVar.f12818b;
                        dataHolder3.c(i16, "asset_key");
                        hashMap.put(dataHolder3.d[aVar.f12819c].getString(i16, dataHolder3.f4997c.getInt("asset_key")), aVar);
                    }
                }
                StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
                int i17 = this.f12818b;
                dataHolder2.c(i17, "path");
                sb2.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.f12819c].getString(i17, dataHolder2.f4997c.getInt("path"))))));
                if (blob == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(blob.length);
                }
                sb2.append(", dataSz=".concat(valueOf.toString()));
                int size = hashMap.size();
                sb2.append(", numAssets=" + size);
                if (isLoggable && !hashMap.isEmpty()) {
                    sb2.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String id2 = ((x8.f) entry.getValue()).getId();
                        sb2.append(str2 + ((String) entry.getKey()) + ": " + id2);
                        str2 = ", ";
                    }
                    sb2.append("]");
                }
                sb2.append(" }");
                return sb2.toString();
        }
    }
}
