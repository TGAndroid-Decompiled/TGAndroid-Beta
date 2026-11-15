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
    public long f52888a = System.currentTimeMillis();
    public String f52889b;
    public String f52890c;
    public String d;
    public int f52891e;
    public int f52892f;
    public Bitmap f52893i;
    public byte[] f52894j;

    public static z1 a(s0 s0Var) {
        z1 z1Var = new z1();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        z1Var.f52889b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            z1Var.f52890c = s0Var.L;
        }
        z1Var.d = s0Var.f52772r;
        if (s0Var.f52773s) {
            z1Var.f52891e = s0Var.f52775x;
        }
        if (s0Var.f52774w) {
            z1Var.f52892f = s0Var.f52776y;
        }
        if (s0Var.N) {
            z1Var.f52893i = s0Var.P;
        }
        return z1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f52888a = inputSerializedData.readInt64(z10);
        this.f52889b = inputSerializedData.readString(z10);
        this.f52890c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f52891e = inputSerializedData.readInt32(z10);
        this.f52892f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f52893i = null;
            return;
        }
        this.f52894j = inputSerializedData.readByteArray(z10);
        this.f52893i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f52894j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f52888a);
        String str = this.f52889b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f52890c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f52891e);
        outputSerializedData.writeInt32(this.f52892f);
        if (this.f52893i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f52894j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f52893i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f52893i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f52894j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
