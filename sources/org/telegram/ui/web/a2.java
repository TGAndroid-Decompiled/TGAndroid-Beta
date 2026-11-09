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
public final class a2 extends TLObject {
    public long f51072a = System.currentTimeMillis();
    public String f51073b;
    public String f51074c;
    public String d;
    public int f51075e;
    public int f51076f;
    public Bitmap f51077i;
    public byte[] f51078j;

    public static a2 a(u0 u0Var) {
        a2 a2Var = new a2();
        String K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), true);
        a2Var.f51073b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (u0Var.J) {
            a2Var.f51074c = u0Var.K;
        }
        a2Var.d = u0Var.f51300r;
        if (u0Var.f51301s) {
            a2Var.f51075e = u0Var.f51303x;
        }
        if (u0Var.f51302w) {
            a2Var.f51076f = u0Var.f51304y;
        }
        if (u0Var.M) {
            a2Var.f51077i = u0Var.O;
        }
        return a2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51072a = inputSerializedData.readInt64(z9);
        this.f51073b = inputSerializedData.readString(z9);
        this.f51074c = inputSerializedData.readString(z9);
        this.d = inputSerializedData.readString(z9);
        this.f51075e = inputSerializedData.readInt32(z9);
        this.f51076f = inputSerializedData.readInt32(z9);
        if (inputSerializedData.readInt32(z9) == 1450380236) {
            this.f51077i = null;
            return;
        }
        this.f51078j = inputSerializedData.readByteArray(z9);
        this.f51077i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f51078j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f51072a);
        String str = this.f51073b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f51074c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f51075e);
        outputSerializedData.writeInt32(this.f51076f);
        if (this.f51077i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f51078j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f51077i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f51077i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f51078j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
