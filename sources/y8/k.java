package y8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new c(8);
    public final Uri f54262a;
    public final HashMap f54263b;
    public final byte[] f54264c;

    public k(Uri uri, Bundle bundle, byte[] bArr) {
        this.f54262a = uri;
        HashMap hashMap = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        n6.l.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            n6.l.g(parcelable);
            hashMap.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f54263b = hashMap;
        this.f54264c = bArr;
    }

    public final String toString() {
        Object valueOf;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb2 = new StringBuilder("DataItemParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f54264c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        sb2.append(",dataSz=".concat(valueOf.toString()));
        HashMap hashMap = this.f54263b;
        int size = hashMap.size();
        sb2.append(", numAssets=" + size);
        sb2.append(", uri=".concat(String.valueOf(this.f54262a)));
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
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.f54262a, i10);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        n6.l.g(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f54263b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((DataItemAssetParcelable) entry.getValue()));
        }
        w7.h0.b(parcel, 4, bundle);
        w7.h0.c(parcel, 5, this.f54264c);
        w7.h0.r(parcel, q6);
    }
}
