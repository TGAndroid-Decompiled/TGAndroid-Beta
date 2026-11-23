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
    public long f53330a = System.currentTimeMillis();
    public String f53331b;
    public String f53332c;
    public String d;
    public int f53333e;
    public int f53334f;
    public Bitmap f53335i;
    public byte[] f53336j;

    public static a2 a(s0 s0Var) {
        a2 a2Var = new a2();
        String K0 = org.telegram.messenger.g0.K0(s0Var.getUrl(), true);
        a2Var.f53331b = K0;
        if (TextUtils.isEmpty(K0)) {
            return null;
        }
        if (s0Var.K) {
            a2Var.f53332c = s0Var.L;
        }
        a2Var.d = s0Var.f53537r;
        if (s0Var.f53538s) {
            a2Var.f53333e = s0Var.f53540x;
        }
        if (s0Var.f53539w) {
            a2Var.f53334f = s0Var.f53541y;
        }
        if (s0Var.N) {
            a2Var.f53335i = s0Var.P;
        }
        return a2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f53330a = inputSerializedData.readInt64(z10);
        this.f53331b = inputSerializedData.readString(z10);
        this.f53332c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f53333e = inputSerializedData.readInt32(z10);
        this.f53334f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f53335i = null;
            return;
        }
        this.f53336j = inputSerializedData.readByteArray(z10);
        this.f53335i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f53336j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f53330a);
        String str = this.f53331b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f53332c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f53333e);
        outputSerializedData.writeInt32(this.f53334f);
        if (this.f53335i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f53336j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f53335i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f53335i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f53336j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
