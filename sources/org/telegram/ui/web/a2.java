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
    public long f51091a = System.currentTimeMillis();
    public String f51092b;
    public String f51093c;
    public String d;
    public int f51094e;
    public int f51095f;
    public Bitmap f51096i;
    public byte[] f51097j;

    public static a2 a(u0 u0Var) {
        a2 a2Var = new a2();
        String K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), true);
        a2Var.f51092b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (u0Var.J) {
            a2Var.f51093c = u0Var.K;
        }
        a2Var.d = u0Var.f51321r;
        if (u0Var.f51322s) {
            a2Var.f51094e = u0Var.f51324x;
        }
        if (u0Var.f51323w) {
            a2Var.f51095f = u0Var.f51325y;
        }
        if (u0Var.M) {
            a2Var.f51096i = u0Var.O;
        }
        return a2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51091a = inputSerializedData.readInt64(z9);
        this.f51092b = inputSerializedData.readString(z9);
        this.f51093c = inputSerializedData.readString(z9);
        this.d = inputSerializedData.readString(z9);
        this.f51094e = inputSerializedData.readInt32(z9);
        this.f51095f = inputSerializedData.readInt32(z9);
        if (inputSerializedData.readInt32(z9) == 1450380236) {
            this.f51096i = null;
            return;
        }
        this.f51097j = inputSerializedData.readByteArray(z9);
        this.f51096i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f51097j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f51091a);
        String str = this.f51092b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f51093c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f51094e);
        outputSerializedData.writeInt32(this.f51095f);
        if (this.f51096i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f51097j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f51096i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f51096i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f51097j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
