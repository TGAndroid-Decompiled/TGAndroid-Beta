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
    public long f53421a = System.currentTimeMillis();
    public String f53422b;
    public String f53423c;
    public String d;
    public int f53424e;
    public int f53425f;
    public Bitmap f53426i;
    public byte[] f53427j;

    public static z1 a(s0 s0Var) {
        z1 z1Var = new z1();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        z1Var.f53422b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            z1Var.f53423c = s0Var.L;
        }
        z1Var.d = s0Var.f53304r;
        if (s0Var.f53305s) {
            z1Var.f53424e = s0Var.f53307x;
        }
        if (s0Var.f53306w) {
            z1Var.f53425f = s0Var.f53308y;
        }
        if (s0Var.N) {
            z1Var.f53426i = s0Var.P;
        }
        return z1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53421a = inputSerializedData.readInt64(z10);
        this.f53422b = inputSerializedData.readString(z10);
        this.f53423c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f53424e = inputSerializedData.readInt32(z10);
        this.f53425f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f53426i = null;
            return;
        }
        this.f53427j = inputSerializedData.readByteArray(z10);
        this.f53426i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f53427j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f53421a);
        String str = this.f53422b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f53423c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f53424e);
        outputSerializedData.writeInt32(this.f53425f);
        if (this.f53426i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f53427j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f53426i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f53426i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f53427j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
