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
public final class b2 extends TLObject {
    public long f51101a = System.currentTimeMillis();
    public String f51102b;
    public String f51103c;
    public String d;
    public int f51104e;
    public int f51105f;
    public Bitmap f51106i;
    public byte[] f51107j;

    public static b2 a(u0 u0Var) {
        b2 b2Var = new b2();
        String K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), true);
        b2Var.f51102b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (u0Var.J) {
            b2Var.f51103c = u0Var.K;
        }
        b2Var.d = u0Var.f51322r;
        if (u0Var.f51323s) {
            b2Var.f51104e = u0Var.f51325x;
        }
        if (u0Var.f51324w) {
            b2Var.f51105f = u0Var.f51326y;
        }
        if (u0Var.M) {
            b2Var.f51106i = u0Var.O;
        }
        return b2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51101a = inputSerializedData.readInt64(z9);
        this.f51102b = inputSerializedData.readString(z9);
        this.f51103c = inputSerializedData.readString(z9);
        this.d = inputSerializedData.readString(z9);
        this.f51104e = inputSerializedData.readInt32(z9);
        this.f51105f = inputSerializedData.readInt32(z9);
        if (inputSerializedData.readInt32(z9) == 1450380236) {
            this.f51106i = null;
            return;
        }
        this.f51107j = inputSerializedData.readByteArray(z9);
        this.f51106i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f51107j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f51101a);
        String str = this.f51102b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f51103c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f51104e);
        outputSerializedData.writeInt32(this.f51105f);
        if (this.f51106i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f51107j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f51106i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f51106i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f51107j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
