package r2;

import android.net.Uri;
import j2.c0;
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
    public final j2.h f56333a;
    public final byte[] f56334b;
    public final byte[] f56335c;
    public CipherInputStream d;

    public a(j2.h hVar, byte[] bArr, byte[] bArr2) {
        this.f56333a = hVar;
        this.f56334b = bArr;
        this.f56335c = bArr2;
    }

    @Override
    public final void addTransferListener(c0 c0Var) {
        c0Var.getClass();
        this.f56333a.addTransferListener(c0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f56333a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f56333a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f56333a.getUri();
    }

    @Override
    public final long open(j2.m mVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f56334b, "AES"), new IvParameterSpec(this.f56335c));
                j2.k kVar = new j2.k(this.f56333a, mVar);
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
