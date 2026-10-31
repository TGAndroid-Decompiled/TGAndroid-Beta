package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.f8;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class c2 extends TLObject {
    public long f43007a = System.currentTimeMillis();
    public String f43008b;
    public String f43009c;
    public String d;
    public int e;
    public int f43010f;
    public Bitmap f43011i;
    public byte[] f43012j;

    public static c2 a(v0 v0Var) {
        c2 c2Var = new c2();
        String K0 = org.telegram.messenger.i0.K0(v0Var.getUrl(), true);
        c2Var.f43008b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (v0Var.J) {
            c2Var.f43009c = v0Var.K;
        }
        c2Var.d = v0Var.f43213r;
        if (v0Var.f43214s) {
            c2Var.e = v0Var.f43216x;
        }
        if (v0Var.f43215w) {
            c2Var.f43010f = v0Var.f43217y;
        }
        if (v0Var.M) {
            c2Var.f43011i = v0Var.O;
        }
        return c2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43007a = inputSerializedData.readInt64(z10);
        this.f43008b = inputSerializedData.readString(z10);
        this.f43009c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f43010f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43011i = null;
            return;
        }
        this.f43012j = inputSerializedData.readByteArray(z10);
        this.f43011i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43012j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f43007a);
        String str = this.f43008b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f43009c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.e);
        outputSerializedData.writeInt32(this.f43010f);
        if (this.f43011i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43012j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f43011i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f43011i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43012j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
