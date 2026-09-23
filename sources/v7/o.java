package v7;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
public abstract class o {
    public static androidx.biometric.t a() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder b10 = androidx.biometric.z.b("androidxBiometric", 3);
            androidx.biometric.z.d(b10);
            androidx.biometric.z.e(b10);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            androidx.biometric.z.c(keyGenerator, androidx.biometric.z.a(b10));
            keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, (SecretKey) keyStore.getKey("androidxBiometric", null));
            return new androidx.biometric.t(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static BiometricPrompt.CryptoObject b(androidx.biometric.t tVar) {
        IdentityCredential identityCredential;
        if (tVar == null) {
            return null;
        }
        Cipher cipher = tVar.f2064b;
        if (cipher != null) {
            return androidx.biometric.a0.b(cipher);
        }
        Signature signature = tVar.f2063a;
        if (signature != null) {
            return androidx.biometric.a0.a(signature);
        }
        Mac mac = tVar.f2065c;
        if (mac != null) {
            return androidx.biometric.a0.c(mac);
        }
        if (Build.VERSION.SDK_INT < 30 || (identityCredential = tVar.d) == null) {
            return null;
        }
        return androidx.biometric.b0.a(identityCredential);
    }
}
