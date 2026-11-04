package q2;

import android.net.Uri;
import i2.d0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements i2.h {
    public final i2.h f53663a;
    public final byte[] f53664b;
    public final byte[] f53665c;
    public CipherInputStream d;

    public a(i2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f53663a = hVar;
        this.f53664b = bArr;
        this.f53665c = bArr2;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f53663a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f53663a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f53663a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f53663a.getUri();
    }

    @Override
    public final long open(i2.n nVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f53664b, "AES"), new IvParameterSpec(this.f53665c));
                i2.l lVar = new i2.l(this.f53663a, nVar);
                this.d = new CipherInputStream(lVar, cipher);
                lVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        this.d.getClass();
        int read = this.d.read(bArr, i3, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
