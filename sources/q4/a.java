package q4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.y0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public final class a implements com.google.android.exoplayer2.upstream.m {
    public final com.google.android.exoplayer2.upstream.m f46251a;
    public final byte[] f46252b;
    public final byte[] f46253c;
    public CipherInputStream d;

    public a(com.google.android.exoplayer2.upstream.m mVar, byte[] bArr, byte[] bArr2) {
        this.f46251a = mVar;
        this.f46252b = bArr;
        this.f46253c = bArr2;
    }

    @Override
    public final void addTransferListener(y0 y0Var) {
        y0Var.getClass();
        this.f46251a.addTransferListener(y0Var);
    }

    @Override
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f46251a.close();
        }
    }

    @Override
    public final Map getResponseHeaders() {
        return this.f46251a.getResponseHeaders();
    }

    @Override
    public final Uri getUri() {
        return this.f46251a.getUri();
    }

    @Override
    public final long open(com.google.android.exoplayer2.upstream.q qVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f46252b, "AES"), new IvParameterSpec(this.f46253c));
                com.google.android.exoplayer2.upstream.o oVar = new com.google.android.exoplayer2.upstream.o(this.f46251a, qVar);
                this.d = new CipherInputStream(oVar, cipher);
                oVar.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
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
