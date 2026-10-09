package w7;
public abstract class h6 {
    public static void a(float[] fArr, int i10, int i11, float f7, float f10, float f11, float f12, int i12, int i13, boolean z10, int[] iArr, float[] fArr2) {
        double d;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        fArr2[1] = Float.POSITIVE_INFINITY;
        fArr2[0] = Float.POSITIVE_INFINITY;
        iArr[1] = 0;
        iArr[0] = 0;
        iArr[2] = i10;
        iArr[3] = i11;
        if (i10 > 0 && i11 > 0) {
            double d15 = fArr[8];
            double d16 = d15 * 2.0d;
            double d17 = fArr[4];
            double d18 = d17 * (-1.219512d);
            double d19 = (((d17 * 0.609756d) + (fArr[0] * (-0.012500000186264515d))) - d15) + fArr[12];
            double d20 = fArr[9];
            double d21 = d20 * 2.0d;
            double d22 = fArr[5];
            double d23 = d22 * (-1.219512d);
            double d24 = (((d22 * 0.609756d) + (fArr[1] * (-0.012500000186264515d))) - d20) + fArr[13];
            double d25 = fArr[11];
            double d26 = d25 * 2.0d;
            double d27 = fArr[7];
            double d28 = (-1.219512d) * d27;
            double d29 = (((d27 * 0.609756d) + (fArr[3] * (-0.012500000186264515d))) - d25) + fArr[15];
            double d30 = (d23 * d29) - (d24 * d28);
            double d31 = d21 * d29;
            double d32 = d24 * d26;
            double d33 = (d21 * d28) - (d23 * d26);
            double d34 = (d19 * d33) + ((d16 * d30) - ((d31 - d32) * d18));
            if (Math.abs(d34) >= 1.0E-12d) {
                double d35 = d30 / d34;
                double d36 = ((d19 * d28) - (d18 * d29)) / d34;
                double d37 = ((d18 * d24) - (d19 * d23)) / d34;
                double d38 = (d32 - d31) / d34;
                double d39 = ((d16 * d29) - (d19 * d26)) / d34;
                double d40 = ((d19 * d21) - (d16 * d24)) / d34;
                double d41 = d33 / d34;
                double d42 = ((d18 * d26) - (d16 * d28)) / d34;
                double d43 = ((d16 * d23) - (d18 * d21)) / d34;
                double d44 = i10;
                double d45 = (4.0d / d44) + 1.0d;
                double d46 = i11;
                double d47 = (4.0d / d46) + 1.0d;
                double abs = (d43 - (Math.abs(d41) * d45)) - (Math.abs(d42) * d47);
                if (abs > 1.0E-9d) {
                    double d48 = abs * abs;
                    double d49 = d35 * d42;
                    double d50 = d41 * d36;
                    double abs2 = ((((Math.abs((d36 * d43) - (d37 * d42)) + (Math.abs(d50 - d49) * d45)) * 2.0d) / d46) + (((Math.abs((d35 * d43) - (d41 * d37)) + (Math.abs(d49 - d50) * d47)) * 2.0d) / d44)) / d48;
                    double d51 = d38 * d42;
                    double d52 = d41 * d39;
                    double abs3 = ((((Math.abs((d39 * d43) - (d42 * d40)) + (Math.abs(d52 - d51) * d45)) * 2.0d) / d46) + (((Math.abs((d38 * d43) - (d41 * d40)) + (Math.abs(d51 - d52) * d47)) * 2.0d) / d44)) / d48;
                    fArr2[0] = (float) abs2;
                    fArr2[1] = (float) abs3;
                    double d53 = i12;
                    double max = Math.max(1.0d / d53, abs2 * 1.5d) + (2.0d / d53);
                    double d54 = i13;
                    double max2 = Math.max(1.0d / d54, abs3 * 1.5d) + (2.0d / d54);
                    if (z10) {
                        double max3 = Math.max(1.0d, Math.max(abs2 * d53, abs3 * d54)) * 4.0d;
                        double d55 = (max3 / d53) + max;
                        d = max2 + (max3 / d54);
                        d10 = d55;
                    } else {
                        d = max2;
                        d10 = max;
                    }
                    double d56 = Double.NEGATIVE_INFINITY;
                    double d57 = d10;
                    double d58 = d;
                    double d59 = Double.POSITIVE_INFINITY;
                    double d60 = Double.POSITIVE_INFINITY;
                    int i14 = 0;
                    double d61 = Double.NEGATIVE_INFINITY;
                    while (i14 < 4) {
                        if ((i14 & 1) == 0) {
                            d11 = d46;
                            d12 = f7 - d57;
                        } else {
                            d11 = d46;
                            d12 = f11 + d57;
                        }
                        if ((i14 & 2) == 0) {
                            d13 = d12;
                            d14 = f10 - d58;
                        } else {
                            d13 = d12;
                            d14 = f12 + d58;
                        }
                        double d62 = (d28 * d14) + (d26 * d13) + d29;
                        if (d62 > 1.0E-9d) {
                            double d63 = d14;
                            double d64 = ((((((d18 * d14) + (d16 * d13)) + d19) / d62) * 0.5d) + 0.5d) * d44;
                            double d65 = ((((((d23 * d63) + (d13 * d21)) + d24) / d62) * 0.5d) + 0.5d) * d11;
                            if (!Double.isInfinite(d64) && !Double.isNaN(d64) && !Double.isInfinite(d65) && !Double.isNaN(d65)) {
                                d60 = Math.min(d60, d64);
                                d56 = Math.max(d56, d64);
                                d59 = Math.min(d59, d65);
                                d61 = Math.max(d61, d65);
                                i14++;
                                d46 = d11;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    double d66 = d46;
                    int max4 = (int) Math.max(0.0d, Math.min(d44, Math.floor(d60) - 2.0d));
                    int max5 = (int) Math.max(0.0d, Math.min(d66, Math.floor(d59) - 2.0d));
                    iArr[0] = max4;
                    iArr[1] = max5;
                    iArr[2] = Math.max(0, ((int) Math.max(0.0d, Math.min(d44, Math.ceil(d56) + 2.0d))) - max4);
                    iArr[3] = Math.max(0, ((int) Math.max(0.0d, Math.min(d66, Math.ceil(d61) + 2.0d))) - max5);
                }
            }
        }
    }
}
