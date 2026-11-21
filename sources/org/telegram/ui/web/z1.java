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
    public long f53415a = System.currentTimeMillis();
    public String f53416b;
    public String f53417c;
    public String d;
    public int f53418e;
    public int f53419f;
    public Bitmap f53420i;
    public byte[] f53421j;

    public static z1 a(s0 s0Var) {
        z1 z1Var = new z1();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        z1Var.f53416b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            z1Var.f53417c = s0Var.L;
        }
        z1Var.d = s0Var.f53298r;
        if (s0Var.f53299s) {
            z1Var.f53418e = s0Var.f53301x;
        }
        if (s0Var.f53300w) {
            z1Var.f53419f = s0Var.f53302y;
        }
        if (s0Var.N) {
            z1Var.f53420i = s0Var.P;
        }
        return z1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53415a = inputSerializedData.readInt64(z10);
        this.f53416b = inputSerializedData.readString(z10);
        this.f53417c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f53418e = inputSerializedData.readInt32(z10);
        this.f53419f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f53420i = null;
            return;
        }
        this.f53421j = inputSerializedData.readByteArray(z10);
        this.f53420i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f53421j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f53415a);
        String str = this.f53416b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f53417c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f53418e);
        outputSerializedData.writeInt32(this.f53419f);
        if (this.f53420i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f53421j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f53420i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f53420i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f53421j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
