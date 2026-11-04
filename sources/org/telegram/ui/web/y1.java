package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.a8;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class y1 extends TLObject {
    public long f51119a = System.currentTimeMillis();
    public String f51120b;
    public String f51121c;
    public String d;
    public int f51122e;
    public int f51123f;
    public Bitmap f51124i;
    public byte[] f51125j;

    public static y1 a(t0 t0Var) {
        y1 y1Var = new y1();
        String K0 = org.telegram.messenger.g0.K0(t0Var.getUrl(), true);
        y1Var.f51120b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (t0Var.K) {
            y1Var.f51121c = t0Var.L;
        }
        y1Var.d = t0Var.f51027r;
        if (t0Var.f51028s) {
            y1Var.f51122e = t0Var.f51030x;
        }
        if (t0Var.f51029w) {
            y1Var.f51123f = t0Var.f51031y;
        }
        if (t0Var.N) {
            y1Var.f51124i = t0Var.P;
        }
        return y1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f51119a = inputSerializedData.readInt64(z10);
        this.f51120b = inputSerializedData.readString(z10);
        this.f51121c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f51122e = inputSerializedData.readInt32(z10);
        this.f51123f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f51124i = null;
            return;
        }
        this.f51125j = inputSerializedData.readByteArray(z10);
        this.f51124i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f51125j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f51119a);
        String str = this.f51120b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f51121c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f51122e);
        outputSerializedData.writeInt32(this.f51123f);
        if (this.f51124i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f51125j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f51124i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f51124i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f51125j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
