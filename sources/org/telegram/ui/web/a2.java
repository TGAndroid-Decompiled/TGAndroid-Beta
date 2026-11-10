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
    public long f51026a = System.currentTimeMillis();
    public String f51027b;
    public String f51028c;
    public String d;
    public int f51029e;
    public int f51030f;
    public Bitmap f51031i;
    public byte[] f51032j;

    public static a2 a(u0 u0Var) {
        a2 a2Var = new a2();
        String K0 = org.telegram.messenger.g0.K0(u0Var.getUrl(), true);
        a2Var.f51027b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (u0Var.J) {
            a2Var.f51028c = u0Var.K;
        }
        a2Var.d = u0Var.f51254r;
        if (u0Var.f51255s) {
            a2Var.f51029e = u0Var.f51257x;
        }
        if (u0Var.f51256w) {
            a2Var.f51030f = u0Var.f51258y;
        }
        if (u0Var.M) {
            a2Var.f51031i = u0Var.O;
        }
        return a2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.f51026a = inputSerializedData.readInt64(z9);
        this.f51027b = inputSerializedData.readString(z9);
        this.f51028c = inputSerializedData.readString(z9);
        this.d = inputSerializedData.readString(z9);
        this.f51029e = inputSerializedData.readInt32(z9);
        this.f51030f = inputSerializedData.readInt32(z9);
        if (inputSerializedData.readInt32(z9) == 1450380236) {
            this.f51031i = null;
            return;
        }
        this.f51032j = inputSerializedData.readByteArray(z9);
        this.f51031i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f51032j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f51026a);
        String str = this.f51027b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f51028c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f51029e);
        outputSerializedData.writeInt32(this.f51030f);
        if (this.f51031i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f51032j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f51031i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f51031i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f51032j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
