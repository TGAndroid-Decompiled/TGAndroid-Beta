package tg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import g.y;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
public final class f {
    public final boolean f48723a;
    public final boolean f48724b;
    public final boolean f48725c;
    public final int d;
    public boolean e;
    public final RenderNode[] f48726f;
    public long f48727g;
    public final RectF h = new RectF();
    public final y f48728i = new Object();
    public final ArrayList f48729j = new ArrayList();
    public int f48730k;
    public int f48731l;
    public Rect f48732m;

    public f(boolean z10) {
        int i10;
        boolean e = sc.e(262144);
        this.f48723a = e;
        this.f48725c = true;
        if (!e && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f48724b = z10;
        this.f48726f = new RenderNode[e ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f48726f;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = w.n();
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        if (f7 > 0.0f) {
            f11 = (f7 * 0.57735f) + 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f13 = f11 / f10;
        if (f13 > 0.5f) {
            f12 = (f13 - 0.5f) / 0.57735f;
        }
        return Math.max(1.0f, f12);
    }

    public final void b(Canvas canvas, int i10) {
        if (canvas.isHardwareAccelerated()) {
            boolean z10 = this.f48723a;
            if (!z10 && this.f48725c) {
                canvas.drawRenderNode(this.f48726f[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.f48726f[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.f48726f[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.f48726f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.f48723a;
        if (!z10 && this.f48725c) {
            i11 = 0;
        } else if (i10 == -2) {
            i11 = !z10 ? 1 : 0;
        } else if (i10 == -4) {
            i11 = 3;
        } else if (i10 == -3) {
            i11 = 1;
        } else {
            return;
        }
        for (int i12 = 0; i12 < this.f48730k; i12++) {
            e eVar = (e) this.f48729j.get(i12);
            Rect rect = eVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = eVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i11, i12);
                if (!d.hasDisplayList()) {
                    this.e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i10, int i11) {
        d dVar;
        e eVar = (e) this.f48729j.get(i11);
        if (this.f48723a && (dVar = eVar.f48722c) != null) {
            if (i10 == 3) {
                return dVar.f48715c[0];
            }
            if (i10 == 0) {
                RenderNode[] renderNodeArr = dVar.f48715c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return eVar.f48721b.f48715c[0];
        }
        RenderNode[] renderNodeArr2 = eVar.f48721b.f48715c;
        return renderNodeArr2[Math.min(i10, renderNodeArr2.length - 1)];
    }

    public final void e(ug.a aVar, int i10, int i11) {
        long j10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f48730k;
            ArrayList arrayList = this.f48729j;
            if (i12 < i14) {
                e eVar = (e) arrayList.get(i12);
                Rect rect = eVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                y yVar = this.f48728i;
                yVar.f7257a = 0L;
                yVar.f7258b = false;
                aVar.g(yVar, rectF);
                boolean z10 = yVar.f7258b;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = yVar.f7257a;
                }
                if (z10 || eVar.e != j10 || !eVar.f48720a.hasDisplayList()) {
                    eVar.e = j10;
                    if (this.f48732m == null) {
                        e eVar2 = (e) arrayList.get(i12);
                        Rect rect2 = eVar2.d;
                        this.f48732m = rect2;
                        this.f48731l = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        eVar2.f48720a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = eVar2.f48720a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.d(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f48732m != null) {
                            e eVar3 = (e) arrayList.get(this.f48731l);
                            eVar3.f48720a.endRecording();
                            d dVar = eVar3.f48721b;
                            d dVar2 = eVar3.f48722c;
                            if (dVar2 != null) {
                                dVar2.a(eVar3.f48720a);
                                dVar.a(dVar2.f48715c[0]);
                            } else {
                                dVar.a(eVar3.f48720a);
                            }
                            this.f48732m = null;
                            i13++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i12++;
            } else if (i13 > 0) {
                long p5 = ui.p(ui.p(0L, i10), i11);
                int i17 = 0;
                boolean z11 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f48726f;
                    if (i17 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i17];
                    p5 = ui.p(p5, renderNode.getUniqueId());
                    for (int i18 = 0; i18 < this.f48730k; i18++) {
                        RenderNode d = d(i17, i18);
                        Rect rect3 = ((e) arrayList.get(i18)).d;
                        p5 = ui.p(ui.p(ui.p(ui.p(ui.p(p5, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i17++;
                }
                if (p5 != this.f48727g || z11) {
                    this.f48727g = p5;
                    int i19 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f48726f;
                        if (i19 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f48730k; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((e) arrayList.get(i20)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i19, i20));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i19++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.f48730k; i10++) {
            e eVar = (e) this.f48729j.get(i10);
            eVar.f48721b.b(f7, f10);
            d dVar = eVar.f48722c;
            if (dVar != null) {
                dVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f48730k = i10;
        while (true) {
            int i11 = this.f48730k;
            arrayList2 = this.f48729j;
            if (i11 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new e(this));
        }
        for (int i12 = 0; i12 < this.f48730k; i12++) {
            e.a((e) arrayList2.get(i12), (RectF) arrayList.get(i12));
        }
    }

    public final void h(gi.a aVar) {
        ArrayList arrayList;
        this.f48730k = aVar.f7532b;
        while (true) {
            int i10 = this.f48730k;
            arrayList = this.f48729j;
            if (i10 <= arrayList.size()) {
                break;
            }
            arrayList.add(new e(this));
        }
        for (int i11 = 0; i11 < this.f48730k; i11++) {
            e.a((e) arrayList.get(i11), aVar.c(i11));
        }
    }
}
