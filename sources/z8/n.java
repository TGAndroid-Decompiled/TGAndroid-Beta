package z8;

import a8.df;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new d(8);
    public final Uri f52749a;
    public final HashMap f52750b;
    public final byte[] f52751c;

    public n(Uri uri, Bundle bundle, byte[] bArr) {
        this.f52749a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        o6.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            o6.l.h(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f52750b = hashMap;
        this.f52751c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f52751c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb2.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f52750b;
        int size = hashMap.size();
        sb2.append(", numAssets=" + size);
        sb2.append(", uri=".concat(String.valueOf(this.f52749a)));
        if (!isLoggable) {
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append("]\n  assets: ");
        for (String str : hashMap.keySet()) {
            String valueOf2 = String.valueOf(hashMap.get(str));
            sb2.append("\n    " + str + ": " + valueOf2);
        }
        sb2.append("\n  ]");
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f52749a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        o6.l.h(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f52750b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((y8.f) entry.getValue()));
        }
        df.b(parcel, 4, bundle);
        df.c(parcel, 5, this.f52751c);
        df.r(parcel, q5);
    }
}
