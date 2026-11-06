package r2;

import android.net.Uri;
import j2.d0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements j2.h {
    public final j2.h f54184a;
    public final byte[] f54185b;
    public final byte[] f54186c;
    public CipherInputStream d;

    public a(j2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f54184a = hVar;
        this.f54185b = bArr;
        this.f54186c = bArr2;
    }

    @Override
    public final void addTransferListener(d0 d0Var) {
        d0Var.getClass();
        this.f54184a.addTransferListener(d0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f54184a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f54184a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f54184a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f54185b, "AES"), new IvParameterSpec(this.f54186c));
                j2.k kVar = new j2.k(this.f54184a, mVar);
                this.d = new CipherInputStream(kVar, cipher);
                kVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        this.d.getClass();
        int read = this.d.read(bArr, i7, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
