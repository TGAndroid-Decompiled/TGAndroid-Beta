package p7;
public final class m0 extends n0 {
    public m0(java.lang.String r2, java.lang.String r3) {
        throw new UnsupportedOperationException("Method not decompiled: p7.m0.<init>(java.lang.String, java.lang.String):void");
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i3) {
        int i10 = 0;
        a.m(0, i3, bArr.length);
        for (int i11 = i3; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            k0 k0Var = this.f53384a;
            char[] cArr = k0Var.f53373b;
            char[] cArr2 = k0Var.f53373b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr2[(i12 >>> 12) & 63]);
            sb2.append(cArr2[(i12 >>> 6) & 63]);
            sb2.append(cArr2[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i3) {
            b(sb2, bArr, i10, i3 - i10);
        }
    }
}
