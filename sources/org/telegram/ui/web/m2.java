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
public final class m2 extends TLObject {
    public long f43340a = System.currentTimeMillis();
    public String f43341b;
    public String f43342c;
    public String d;
    public int f43343e;
    public int f43344f;
    public Bitmap f43345i;
    public byte[] f43346j;

    public static m2 a(y0 y0Var) {
        m2 m2Var = new m2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        m2Var.f43341b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            m2Var.f43342c = y0Var.K;
        }
        m2Var.d = y0Var.f43490r;
        if (y0Var.f43491s) {
            m2Var.f43343e = y0Var.f43492w;
        }
        if (y0Var.v) {
            m2Var.f43344f = y0Var.f43493x;
        }
        if (y0Var.M) {
            m2Var.f43345i = y0Var.O;
        }
        return m2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43340a = inputSerializedData.readInt64(z10);
        this.f43341b = inputSerializedData.readString(z10);
        this.f43342c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f43343e = inputSerializedData.readInt32(z10);
        this.f43344f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43345i = null;
            return;
        }
        this.f43346j = inputSerializedData.readByteArray(z10);
        this.f43345i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43346j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f43340a);
        String str = this.f43341b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f43342c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f43343e);
        outputSerializedData.writeInt32(this.f43344f);
        if (this.f43345i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43346j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f43345i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f43345i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43346j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
