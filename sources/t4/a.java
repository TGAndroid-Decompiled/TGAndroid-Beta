package t4;

import android.net.Uri;
import g5.v0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements g5.m {
    public final g5.m f47911a;
    public final byte[] f47912b;
    public final byte[] f47913c;
    public CipherInputStream d;

    public a(g5.m mVar, byte[] bArr, byte[] bArr2) {
        this.f47911a = mVar;
        this.f47912b = bArr;
        this.f47913c = bArr2;
    }

    @Override
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.f47911a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f47911a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f47911a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f47911a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f47912b, "AES"), new IvParameterSpec(this.f47913c));
                g5.o oVar = new g5.o(this.f47911a, pVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e6) {
                throw new RuntimeException(e6);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        this.d.getClass();
        int read = this.d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
