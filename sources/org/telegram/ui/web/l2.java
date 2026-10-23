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
    public long f42717a = System.currentTimeMillis();
    public String f42718b;
    public String f42719c;
    public String d;
    public int e;
    public int f42720f;
    public Bitmap f42721i;
    public byte[] f42722j;

    public static l2 a(x0 x0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(x0Var.getUrl(), true);
        l2Var.f42718b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (x0Var.J) {
            l2Var.f42719c = x0Var.K;
        }
        l2Var.d = x0Var.f42854r;
        if (x0Var.f42855s) {
            l2Var.e = x0Var.f42856w;
        }
        if (x0Var.v) {
            l2Var.f42720f = x0Var.f42857x;
        }
        if (x0Var.M) {
            l2Var.f42721i = x0Var.O;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42717a = inputSerializedData.readInt64(z10);
        this.f42718b = inputSerializedData.readString(z10);
        this.f42719c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f42720f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f42721i = null;
            return;
        }
        this.f42722j = inputSerializedData.readByteArray(z10);
        this.f42721i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f42722j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f42717a);
        String str = this.f42718b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f42719c;
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
        outputSerializedData.writeInt32(this.f42720f);
        if (this.f42721i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f42722j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f42721i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f42721i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f42722j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
