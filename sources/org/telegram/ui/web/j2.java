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
public final class j2 extends TLObject {
    public long f44076a = System.currentTimeMillis();
    public String f44077b;
    public String f44078c;
    public String d;
    public int f44079e;
    public int f44080f;
    public Bitmap f44081i;
    public byte[] f44082j;

    public static j2 a(w0 w0Var) {
        j2 j2Var = new j2();
        String hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl(), true);
        j2Var.f44077b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (w0Var.F) {
            j2Var.f44078c = w0Var.G;
        }
        j2Var.d = w0Var.f44231r;
        if (w0Var.f44232s) {
            j2Var.f44079e = w0Var.f44233w;
        }
        if (w0Var.v) {
            j2Var.f44080f = w0Var.f44234x;
        }
        if (w0Var.I) {
            j2Var.f44081i = w0Var.K;
        }
        return j2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f44076a = inputSerializedData.readInt64(z10);
        this.f44077b = inputSerializedData.readString(z10);
        this.f44078c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f44079e = inputSerializedData.readInt32(z10);
        this.f44080f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f44081i = null;
            return;
        }
        this.f44082j = inputSerializedData.readByteArray(z10);
        this.f44081i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f44082j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f44076a);
        String str = this.f44077b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f44078c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f44079e);
        outputSerializedData.writeInt32(this.f44080f);
        if (this.f44081i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f44082j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f44081i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f44081i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f44082j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
