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
public final class n2 extends TLObject {
    public long f39105a = System.currentTimeMillis();
    public String f39106b;
    public String f39107c;
    public String d;
    public int e;
    public int f39108f;
    public Bitmap f39109i;
    public byte[] f39110j;

    public static n2 a(z0 z0Var) {
        n2 n2Var = new n2();
        String hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl(), true);
        n2Var.f39106b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (z0Var.J) {
            n2Var.f39107c = z0Var.K;
        }
        n2Var.d = z0Var.f39246r;
        if (z0Var.f39247s) {
            n2Var.e = z0Var.f39248w;
        }
        if (z0Var.v) {
            n2Var.f39108f = z0Var.f39249x;
        }
        if (z0Var.M) {
            n2Var.f39109i = z0Var.O;
        }
        return n2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f39105a = inputSerializedData.readInt64(z10);
        this.f39106b = inputSerializedData.readString(z10);
        this.f39107c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f39108f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f39109i = null;
            return;
        }
        this.f39110j = inputSerializedData.readByteArray(z10);
        this.f39109i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f39110j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f39105a);
        String str = this.f39106b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f39107c;
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
        outputSerializedData.writeInt32(this.f39108f);
        if (this.f39109i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f39110j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f39109i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f39109i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f39110j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
