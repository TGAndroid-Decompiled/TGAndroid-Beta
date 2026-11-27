package org.webrtc;
public final class CryptoOptions {
    private final SFrame sframe;
    private final Srtp srtp;

    private CryptoOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.srtp = new Srtp(this, z, z2, z3, z4, z5, 0);
        this.sframe = new SFrame(this, z6, 0);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public SFrame getSFrame() {
        return this.sframe;
    }

    public Srtp getSrtp() {
        return this.srtp;
    }

    public final class SFrame {
        private final boolean requireFrameEncryption;

        private SFrame(boolean z) {
            this.requireFrameEncryption = z;
        }

        public boolean getRequireFrameEncryption() {
            return this.requireFrameEncryption;
        }

        public SFrame(CryptoOptions cryptoOptions, boolean z, int i) {
            this(z);
        }
    }

    public static class Builder {
        private boolean enableAes128Sha1_32CryptoCipher;
        private boolean enableAes128Sha1_80CryptoCipher;
        private boolean enableEncryptedRtpHeaderExtensions;
        private boolean enableGcmCryptoSuites;
        private boolean preferGcmCryptoSuites;
        private boolean requireFrameEncryption;

        private Builder() {
            this.enableGcmCryptoSuites = true;
            this.enableAes128Sha1_80CryptoCipher = true;
            this.enableEncryptedRtpHeaderExtensions = true;
        }

        public CryptoOptions createCryptoOptions() {
            return new CryptoOptions(this.enableGcmCryptoSuites, this.preferGcmCryptoSuites, this.enableAes128Sha1_32CryptoCipher, this.enableAes128Sha1_80CryptoCipher, this.enableEncryptedRtpHeaderExtensions, this.requireFrameEncryption, 0);
        }

        public Builder setEnableAes128Sha1_32CryptoCipher(boolean z) {
            this.enableAes128Sha1_32CryptoCipher = z;
            return this;
        }

        public Builder setEnableAes128Sha1_80CryptoCipher(boolean z) {
            this.enableAes128Sha1_80CryptoCipher = z;
            return this;
        }

        public Builder setEnableEncryptedRtpHeaderExtensions(boolean z) {
            this.enableEncryptedRtpHeaderExtensions = z;
            return this;
        }

        public Builder setEnableGcmCryptoSuites(boolean z) {
            this.enableGcmCryptoSuites = z;
            return this;
        }

        public Builder setPreferGcmCryptoSuites(boolean z) {
            this.preferGcmCryptoSuites = z;
            return this;
        }

        public Builder setRequireFrameEncryption(boolean z) {
            this.requireFrameEncryption = z;
            return this;
        }

        public Builder(int i) {
            this();
        }
    }

    public final class Srtp {
        private final boolean enableAes128Sha1_32CryptoCipher;
        private final boolean enableAes128Sha1_80CryptoCipher;
        private final boolean enableEncryptedRtpHeaderExtensions;
        private final boolean enableGcmCryptoSuites;
        private final boolean preferGcmCryptoSuites;

        private Srtp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.enableGcmCryptoSuites = z;
            this.preferGcmCryptoSuites = z2;
            this.enableAes128Sha1_32CryptoCipher = z3;
            this.enableAes128Sha1_80CryptoCipher = z4;
            this.enableEncryptedRtpHeaderExtensions = z5;
        }

        public boolean getEnableAes128Sha1_32CryptoCipher() {
            return this.enableAes128Sha1_32CryptoCipher;
        }

        public boolean getEnableAes128Sha1_80CryptoCipher() {
            return this.enableAes128Sha1_80CryptoCipher;
        }

        public boolean getEnableEncryptedRtpHeaderExtensions() {
            return this.enableEncryptedRtpHeaderExtensions;
        }

        public boolean getEnableGcmCryptoSuites() {
            return this.enableGcmCryptoSuites;
        }

        public boolean getPreferGcmCryptoSuites() {
            return this.preferGcmCryptoSuites;
        }

        public Srtp(CryptoOptions cryptoOptions, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
            this(z, z2, z3, z4, z5);
        }
    }

    public CryptoOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this(z, z2, z3, z4, z5, z6);
    }
}
