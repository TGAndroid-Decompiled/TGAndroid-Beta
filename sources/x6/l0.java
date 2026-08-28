package x6;
public final class l0 extends m0 {
    public l0(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: x6.l0.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i9) {
        int i10 = 0;
        a.m(0, i9, bArr.length);
        for (int i11 = i9; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            j0 j0Var = this.f49037a;
            char[] cArr = j0Var.f49026b;
            char[] cArr2 = j0Var.f49026b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr2[(i12 >>> 12) & 63]);
            sb2.append(cArr2[(i12 >>> 6) & 63]);
            sb2.append(cArr2[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i9) {
            b(sb2, bArr, i10, i9 - i10);
        }
    }
}
