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
    public final g5.m f44535a;
    public final byte[] f44536b;
    public final byte[] f44537c;
    public CipherInputStream d;

    public a(g5.m mVar, byte[] bArr, byte[] bArr2) {
        this.f44535a = mVar;
        this.f44536b = bArr;
        this.f44537c = bArr2;
    }

    @Override
    public final void addTransferListener(v0 v0Var) {
        v0Var.getClass();
        this.f44535a.addTransferListener(v0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f44535a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f44535a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f44535a.getUri();
    }

    @Override
    public final long open(g5.p pVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f44536b, "AES"), new IvParameterSpec(this.f44537c));
                g5.o oVar = new g5.o(this.f44535a, pVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
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
