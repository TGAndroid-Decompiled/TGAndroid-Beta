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
public final class l2 extends TLObject {
    public long f42625a = System.currentTimeMillis();
    public String f42626b;
    public String f42627c;
    public String d;
    public int f42628e;
    public int f42629f;
    public Bitmap f42630i;
    public byte[] f42631j;

    public static l2 a(x0 x0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl(), true);
        l2Var.f42626b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (x0Var.G) {
            l2Var.f42627c = x0Var.H;
        }
        l2Var.d = x0Var.f42763r;
        if (x0Var.f42764s) {
            l2Var.f42628e = x0Var.f42765w;
        }
        if (x0Var.v) {
            l2Var.f42629f = x0Var.f42766x;
        }
        if (x0Var.J) {
            l2Var.f42630i = x0Var.L;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f42625a = inputSerializedData.readInt64(z4);
        this.f42626b = inputSerializedData.readString(z4);
        this.f42627c = inputSerializedData.readString(z4);
        this.d = inputSerializedData.readString(z4);
        this.f42628e = inputSerializedData.readInt32(z4);
        this.f42629f = inputSerializedData.readInt32(z4);
        if (inputSerializedData.readInt32(z4) == 1450380236) {
            this.f42630i = null;
            return;
        }
        this.f42631j = inputSerializedData.readByteArray(z4);
        this.f42630i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f42631j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f42625a);
        String str = this.f42626b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f42627c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f42628e);
        outputSerializedData.writeInt32(this.f42629f);
        if (this.f42630i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f42631j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f42630i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f42630i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f42631j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
