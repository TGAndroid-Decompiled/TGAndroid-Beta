package zg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import g.z;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class e {
    public final boolean f48108a;
    public final boolean f48109b;
    public final boolean f48110c;
    public final int d;
    public final RenderNode[] e;
    public long f48111f;
    public final RectF f48112g = new RectF();
    public final z h = new Object();
    public final ArrayList f48113i = new ArrayList();
    public int f48114j;
    public int f48115k;
    public Rect f48116l;

    public e(boolean z10) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f48108a = isEnabled;
        this.f48110c = true;
        if (!isEnabled && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f48109b = z10;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = ah.b.k();
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
            boolean z10 = this.f48108a;
            if (!z10 && this.f48110c) {
                canvas.drawRenderNode(this.e[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.e[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.e[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.e[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(android.graphics.Canvas r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: zg.e.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        c cVar;
        d dVar = (d) this.f48113i.get(i11);
        if (this.f48108a && (cVar = dVar.f48107c) != null) {
            if (i10 == 0) {
                return cVar.f48100c[0];
            }
            return dVar.f48106b.f48100c[0];
        }
        RenderNode[] renderNodeArr = dVar.f48106b.f48100c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(ah.a aVar, int i10, int i11) {
        long j3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f48114j;
            ArrayList arrayList = this.f48113i;
            if (i12 < i14) {
                d dVar = (d) arrayList.get(i12);
                Rect rect = dVar.d;
                RectF rectF = this.f48112g;
                rectF.set(rect);
                z zVar = this.h;
                zVar.f8455a = 0L;
                zVar.f8456b = false;
                aVar.g(zVar, rectF);
                boolean z10 = zVar.f8456b;
                if (z10) {
                    j3 = -1;
                } else {
                    j3 = zVar.f8455a;
                }
                if (z10 || dVar.e != j3 || !dVar.f48105a.hasDisplayList()) {
                    dVar.e = j3;
                    if (this.f48116l == null) {
                        d dVar2 = (d) arrayList.get(i12);
                        Rect rect2 = dVar2.d;
                        this.f48116l = rect2;
                        this.f48115k = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        dVar2.f48105a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = dVar2.f48105a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.e(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f48116l != null) {
                            d dVar3 = (d) arrayList.get(this.f48115k);
                            dVar3.f48105a.endRecording();
                            c cVar = dVar3.f48106b;
                            c cVar2 = dVar3.f48107c;
                            if (cVar2 != null) {
                                cVar2.a(dVar3.f48105a);
                                cVar.a(cVar2.f48100c[0]);
                            } else {
                                cVar.a(dVar3.f48105a);
                            }
                            this.f48116l = null;
                            i13++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i12++;
            } else {
                if (i13 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i17 = 0;
                    boolean z11 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i17 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i17];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i18 = 0; i18 < this.f48114j; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((d) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f48111f || z11) {
                        this.f48111f = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f48114j; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((d) arrayList.get(i20)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i19, i20));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i19++;
                        }
                    }
                }
                return false;
            }
        }
    }

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.f48114j; i10++) {
            d dVar = (d) this.f48113i.get(i10);
            dVar.f48106b.b(f7, f10);
            c cVar = dVar.f48107c;
            if (cVar != null) {
                cVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f48114j = i10;
        while (true) {
            int i11 = this.f48114j;
            arrayList = this.f48113i;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new d(this));
        }
        for (int i12 = 0; i12 < this.f48114j; i12++) {
            RectF rectF = (RectF) list.get(i12);
            Rect rect = ((d) arrayList.get(i12)).d;
            float f7 = rectF.left;
            float f10 = 16;
            rect.left = Math.round(f7 - (f7 % f10));
            float f11 = rectF.top;
            rect.top = Math.round(f11 - (f11 % f10));
            float f12 = rectF.right;
            rect.right = Math.round((f10 - (f12 % f10)) + f12);
            float f13 = rectF.bottom;
            rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
        }
    }
}
