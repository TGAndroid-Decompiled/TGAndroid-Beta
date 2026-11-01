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
    public long f42809a = System.currentTimeMillis();
    public String f42810b;
    public String f42811c;
    public String d;
    public int e;
    public int f42812f;
    public Bitmap f42813i;
    public byte[] f42814j;

    public static c2 a(v0 v0Var) {
        c2 c2Var = new c2();
        String K0 = org.telegram.messenger.i0.K0(v0Var.getUrl(), true);
        c2Var.f42810b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (v0Var.J) {
            c2Var.f42811c = v0Var.K;
        }
        c2Var.d = v0Var.f43015r;
        if (v0Var.f43016s) {
            c2Var.e = v0Var.f43018x;
        }
        if (v0Var.f43017w) {
            c2Var.f42812f = v0Var.f43019y;
        }
        if (v0Var.M) {
            c2Var.f42813i = v0Var.O;
        }
        return c2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42809a = inputSerializedData.readInt64(z10);
        this.f42810b = inputSerializedData.readString(z10);
        this.f42811c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f42812f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f42813i = null;
            return;
        }
        this.f42814j = inputSerializedData.readByteArray(z10);
        this.f42813i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f42814j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f42809a);
        String str = this.f42810b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f42811c;
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
        outputSerializedData.writeInt32(this.f42812f);
        if (this.f42813i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f42814j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f42813i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f42813i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f42814j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
