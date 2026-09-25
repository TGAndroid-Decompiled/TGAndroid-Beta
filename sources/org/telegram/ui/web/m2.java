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
    public long f39145a = System.currentTimeMillis();
    public String f39146b;
    public String f39147c;
    public String d;
    public int e;
    public int f39148f;
    public Bitmap f39149i;
    public byte[] f39150j;

    public static m2 a(y0 y0Var) {
        m2 m2Var = new m2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        m2Var.f39146b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            m2Var.f39147c = y0Var.K;
        }
        m2Var.d = y0Var.f39281r;
        if (y0Var.f39282s) {
            m2Var.e = y0Var.f39283w;
        }
        if (y0Var.v) {
            m2Var.f39148f = y0Var.f39284x;
        }
        if (y0Var.M) {
            m2Var.f39149i = y0Var.O;
        }
        return m2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f39145a = inputSerializedData.readInt64(z10);
        this.f39146b = inputSerializedData.readString(z10);
        this.f39147c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f39148f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f39149i = null;
            return;
        }
        this.f39150j = inputSerializedData.readByteArray(z10);
        this.f39149i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f39150j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f39145a);
        String str = this.f39146b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f39147c;
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
        outputSerializedData.writeInt32(this.f39148f);
        if (this.f39149i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f39150j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f39149i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f39149i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f39150j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
