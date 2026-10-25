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
    public long f45310a = System.currentTimeMillis();
    public String f45311b;
    public String f45312c;
    public String d;
    public int e;
    public int f45313f;
    public Bitmap f45314i;
    public byte[] f45315j;

    public static l2 a(x0 x0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl(), true);
        l2Var.f45311b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (x0Var.J) {
            l2Var.f45312c = x0Var.K;
        }
        l2Var.d = x0Var.f45444r;
        if (x0Var.f45445s) {
            l2Var.e = x0Var.f45446w;
        }
        if (x0Var.v) {
            l2Var.f45313f = x0Var.f45447x;
        }
        if (x0Var.M) {
            l2Var.f45314i = x0Var.O;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f45310a = inputSerializedData.readInt64(z10);
        this.f45311b = inputSerializedData.readString(z10);
        this.f45312c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f45313f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f45314i = null;
            return;
        }
        this.f45315j = inputSerializedData.readByteArray(z10);
        this.f45314i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f45315j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f45310a);
        String str = this.f45311b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f45312c;
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
        outputSerializedData.writeInt32(this.f45313f);
        if (this.f45314i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f45315j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f45314i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f45314i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f45315j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
