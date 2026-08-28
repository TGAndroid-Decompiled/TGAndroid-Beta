package xf;
public final class l1 extends o1 {
    public final int f49270f;
    public final p1 f49271g;

    public l1(p1 p1Var, int i9) {
        this.f49270f = i9;
        this.f49271g = p1Var;
    }

    @Override
    public final void a() {
        switch (this.f49270f) {
            case 0:
                p1 p1Var = this.f49271g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f49221c - f1Var.f49226j, f1Var.f49220b - f1Var.f49225i) + 3.141592653589793d;
                f1 f1Var2 = p1Var.h;
                double d = f1Var2.f49227k / 5.5f;
                this.d = f1Var2.f49220b + ((float) (Math.cos(atan2) * d));
                this.f49292e = p1Var.h.f49221c + ((float) (Math.sin(atan2) * d));
                return;
            case 1:
                f1 f1Var3 = this.f49271g.h;
                float f10 = f1Var3.f49221c;
                this.d = f1Var3.f49220b + f1Var3.d;
                this.f49292e = f10;
                return;
            case 2:
                p1 p1Var2 = this.f49271g;
                f1 f1Var4 = p1Var2.h;
                float min = Math.min(f1Var4.d, f1Var4.f49222e);
                float cos = (((float) Math.cos(-0.3141592653589793d)) * min) + p1Var2.h.f49220b;
                float f11 = p1Var2.h.f49221c;
                this.d = cos;
                this.f49292e = (((float) Math.sin(-0.3141592653589793d)) * min) + f11;
                return;
            case 3:
                f1 f1Var5 = this.f49271g.h;
                this.d = f1Var5.f49220b;
                this.f49292e = f1Var5.f49221c - Math.abs(f1Var5.f49222e);
                return;
            case 4:
                f1 f1Var6 = this.f49271g.h;
                float f12 = f1Var6.f49225i;
                float f13 = f1Var6.f49226j;
                f1Var6.f49225i = f12;
                f1Var6.f49226j = f13;
                this.d = f12;
                this.f49292e = f13;
                return;
            default:
                f1 f1Var7 = this.f49271g.h;
                this.d = f1Var7.f49220b;
                this.f49292e = f1Var7.f49221c;
                return;
        }
    }

    @Override
    public final void b(float f10, float f11) {
        switch (this.f49270f) {
            case 0:
                p1 p1Var = this.f49271g;
                f1 f1Var = p1Var.h;
                double atan2 = Math.atan2(f1Var.f49221c - f1Var.f49226j, f1Var.f49220b - f1Var.f49225i) + 1.5707963267948966d;
                f1 f1Var2 = p1Var.h;
                f1 f1Var3 = p1Var.h;
                float f12 = f1Var3.f49220b;
                float f13 = f1Var3.f49221c;
                p1Var.getClass();
                f1Var3.f49227k = Math.min((g7.w.a(f1Var2.f49220b, f1Var2.f49221c, f1Var2.f49225i, f1Var2.f49226j) * 5.5f) / 2.0f, Math.max(100.0f, (-((float) ((Math.cos(atan2) * (f13 - f11)) - (Math.sin(atan2) * (f12 - f10))))) * 5.5f));
                a();
                return;
            case 1:
                this.d = f10;
                this.f49292e = f11;
                f1 f1Var4 = this.f49271g.h;
                float a2 = g7.w.a(f1Var4.f49220b, f1Var4.f49221c, f10, f11);
                f1Var4.f49222e = a2;
                f1Var4.d = a2;
                return;
            case 2:
                p1 p1Var2 = this.f49271g;
                f1 f1Var5 = p1Var2.h;
                float a3 = g7.w.a(f1Var5.f49220b, f1Var5.f49221c, f10, f11);
                f1Var5.f49222e = a3;
                f1Var5.d = a3;
                f1 f1Var6 = p1Var2.h;
                f1Var6.h = (float) ((((float) Math.atan2(f1Var6.f49221c - f11, f10 - f1Var6.f49220b)) - 0.3141592653589793d) + f1Var6.h);
                a();
                return;
            case 3:
                p1 p1Var3 = this.f49271g;
                f1 f1Var7 = p1Var3.h;
                f1Var7.h = (float) ((((float) Math.atan2(f1Var7.f49221c - f11, f10 - f1Var7.f49220b)) - 1.5707963267948966d) + f1Var7.h);
                for (int i9 = 0; i9 < p1Var3.f49305m.size(); i9++) {
                    o1 o1Var = (o1) p1Var3.f49305m.get(i9);
                    if (o1Var instanceof n1) {
                        o1Var.a();
                    }
                }
                return;
            case 4:
                f1 f1Var8 = this.f49271g.h;
                f1Var8.f49225i = f10;
                f1Var8.f49226j = f11;
                this.d = f10;
                this.f49292e = f11;
                float f14 = f1Var8.f49221c;
                float f15 = f1Var8.f49222e;
                float f16 = f14 - f15;
                int i10 = (f11 > f16 ? 1 : (f11 == f16 ? 0 : -1));
                if (i10 > 0 && f11 < f14 + f15) {
                    float f17 = f1Var8.f49220b;
                    if (f10 <= f17) {
                        float f18 = f17 - f1Var8.d;
                        if (f10 > f18) {
                            this.d = f18;
                        }
                    }
                    if (f10 > f14) {
                        float f19 = f17 + f1Var8.d;
                        if (f10 < f19) {
                            this.d = f19;
                        }
                    }
                }
                float f20 = this.d;
                float f21 = f1Var8.f49220b;
                float f22 = f1Var8.d;
                if (f20 > f21 - f22 && f20 < f21 + f22) {
                    if (f11 <= f14 && i10 > 0) {
                        this.f49292e = f16;
                    } else if (f11 > f14) {
                        float f23 = f14 + f15;
                        if (f11 < f23) {
                            this.f49292e = f23;
                        }
                    }
                }
                f1Var8.f49225i = f20;
                f1Var8.f49226j = this.f49292e;
                return;
            default:
                int i11 = 0;
                while (true) {
                    p1 p1Var4 = this.f49271g;
                    if (i11 < p1Var4.f49305m.size()) {
                        o1 o1Var2 = (o1) p1Var4.f49305m.get(i11);
                        if (o1Var2 != this) {
                            o1Var2.a();
                        }
                        i11++;
                    } else {
                        f1 f1Var9 = p1Var4.h;
                        f1Var9.f49220b = f10;
                        f1Var9.f49221c = f11;
                        this.d = f10;
                        this.f49292e = f11;
                        return;
                    }
                }
        }
    }

    public l1(p1 p1Var, int i9, boolean z10) {
        super(0);
        this.f49270f = i9;
        this.f49271g = p1Var;
    }
}
