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
public final class z1 extends TLObject {
    public long f53372a = System.currentTimeMillis();
    public String f53373b;
    public String f53374c;
    public String d;
    public int f53375e;
    public int f53376f;
    public Bitmap f53377i;
    public byte[] f53378j;

    public static z1 a(s0 s0Var) {
        z1 z1Var = new z1();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        z1Var.f53373b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            z1Var.f53374c = s0Var.L;
        }
        z1Var.d = s0Var.f53255r;
        if (s0Var.f53256s) {
            z1Var.f53375e = s0Var.f53258x;
        }
        if (s0Var.f53257w) {
            z1Var.f53376f = s0Var.f53259y;
        }
        if (s0Var.N) {
            z1Var.f53377i = s0Var.P;
        }
        return z1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53372a = inputSerializedData.readInt64(z10);
        this.f53373b = inputSerializedData.readString(z10);
        this.f53374c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f53375e = inputSerializedData.readInt32(z10);
        this.f53376f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f53377i = null;
            return;
        }
        this.f53378j = inputSerializedData.readByteArray(z10);
        this.f53377i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f53378j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f53372a);
        String str = this.f53373b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f53374c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f53375e);
        outputSerializedData.writeInt32(this.f53376f);
        if (this.f53377i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f53378j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f53377i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f53377i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f53378j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
