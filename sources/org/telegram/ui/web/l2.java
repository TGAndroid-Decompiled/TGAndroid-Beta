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
    public long f45313a = System.currentTimeMillis();
    public String f45314b;
    public String f45315c;
    public String d;
    public int e;
    public int f45316f;
    public Bitmap f45317i;
    public byte[] f45318j;

    public static l2 a(x0 x0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl(), true);
        l2Var.f45314b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (x0Var.J) {
            l2Var.f45315c = x0Var.K;
        }
        l2Var.d = x0Var.f45447r;
        if (x0Var.f45448s) {
            l2Var.e = x0Var.f45449w;
        }
        if (x0Var.v) {
            l2Var.f45316f = x0Var.f45450x;
        }
        if (x0Var.M) {
            l2Var.f45317i = x0Var.O;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f45313a = inputSerializedData.readInt64(z10);
        this.f45314b = inputSerializedData.readString(z10);
        this.f45315c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f45316f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f45317i = null;
            return;
        }
        this.f45318j = inputSerializedData.readByteArray(z10);
        this.f45317i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f45318j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f45313a);
        String str = this.f45314b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f45315c;
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
        outputSerializedData.writeInt32(this.f45316f);
        if (this.f45317i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f45318j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f45317i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f45317i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f45318j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
