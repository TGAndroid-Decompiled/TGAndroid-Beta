package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class o2 extends TLObject {
    public long f38034a = System.currentTimeMillis();
    public String f38035b;
    public String f38036c;
    public String d;
    public int e;
    public int f38037f;
    public Bitmap f38038i;
    public byte[] f38039j;

    public static o2 a(y0 y0Var) {
        o2 o2Var = new o2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        o2Var.f38035b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            o2Var.f38036c = y0Var.K;
        }
        o2Var.d = y0Var.f38157r;
        if (y0Var.f38158s) {
            o2Var.e = y0Var.f38159w;
        }
        if (y0Var.v) {
            o2Var.f38037f = y0Var.f38160x;
        }
        if (y0Var.M) {
            o2Var.f38038i = y0Var.O;
        }
        return o2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f38034a = inputSerializedData.readInt64(z10);
        this.f38035b = inputSerializedData.readString(z10);
        this.f38036c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f38037f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f38038i = null;
            return;
        }
        this.f38039j = inputSerializedData.readByteArray(z10);
        this.f38038i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f38039j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f38034a);
        String str = this.f38035b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f38036c;
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
        outputSerializedData.writeInt32(this.f38037f);
        if (this.f38038i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f38039j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f38038i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f38038i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f38039j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
