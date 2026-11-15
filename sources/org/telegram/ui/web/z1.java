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
    public long f52891a = System.currentTimeMillis();
    public String f52892b;
    public String f52893c;
    public String d;
    public int f52894e;
    public int f52895f;
    public Bitmap f52896i;
    public byte[] f52897j;

    public static z1 a(s0 s0Var) {
        z1 z1Var = new z1();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        z1Var.f52892b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            z1Var.f52893c = s0Var.L;
        }
        z1Var.d = s0Var.f52775r;
        if (s0Var.f52776s) {
            z1Var.f52894e = s0Var.f52778x;
        }
        if (s0Var.f52777w) {
            z1Var.f52895f = s0Var.f52779y;
        }
        if (s0Var.N) {
            z1Var.f52896i = s0Var.P;
        }
        return z1Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f52891a = inputSerializedData.readInt64(z10);
        this.f52892b = inputSerializedData.readString(z10);
        this.f52893c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f52894e = inputSerializedData.readInt32(z10);
        this.f52895f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f52896i = null;
            return;
        }
        this.f52897j = inputSerializedData.readByteArray(z10);
        this.f52896i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f52897j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f52891a);
        String str = this.f52892b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f52893c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f52894e);
        outputSerializedData.writeInt32(this.f52895f);
        if (this.f52896i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f52897j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f52896i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f52896i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f52897j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
