package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends View implements org.telegram.ui.Cells.n9 {
    public final t70 f42289a;
    public final g4 f42290b;
    public final ImageReceiver f42291c;
    public final org.telegram.ui.Components.j9 d;
    public b3 f42292e;
    public b3 f42293f;
    public b3 h;
    public b3 f42294n;
    public boolean f42295r;
    public int f42296s;
    public int v;
    public int f42297w;
    public int f42298x;
    public TL_iv.pageBlockEmbedPost f42299y;

    public u1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f42289a = t70Var;
        this.f42290b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f42291c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f42293f;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f42292e;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            arrayList.add(b3Var3);
        }
        b3 b3Var4 = this.f42294n;
        if (b3Var4 != null) {
            arrayList.add(b3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42293f;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.f42292e;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            b3Var3.attach(this);
        }
        b3 b3Var4 = this.f42294n;
        if (b3Var4 != null) {
            b3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42293f;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.f42292e;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
        b3 b3Var3 = this.h;
        if (b3Var3 != null) {
            b3Var3.detach(this);
        }
        b3 b3Var4 = this.f42294n;
        if (b3Var4 != null) {
            b3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f7;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42299y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof x3;
            t70 t70Var = this.f42289a;
            int i12 = 0;
            if (!z10) {
                if (this.f42295r) {
                    this.f42291c.draw(canvas);
                }
                int i13 = 54;
                if (this.f42293f != null) {
                    canvas.save();
                    if (this.f42295r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.f42292e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f7));
                    i4.v(t70Var, canvas, this, 0);
                    this.f42293f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.f42292e != null) {
                    canvas.save();
                    if (!this.f42295r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    i4.v(t70Var, canvas, this, i10);
                    this.f42292e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f42298x;
                if (this.f42299y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, i4.f38483q1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f42296s, this.v);
                i4.v(t70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f42294n != null) {
                canvas2.save();
                canvas2.translate(this.f42296s, this.v + this.f42297w);
                i4.v(t70Var, canvas2, this, i12);
                this.f42294n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f42293f != null) {
            sb2.append(", ");
            sb2.append(this.f42293f.d.getText());
        }
        if (this.f42292e != null) {
            sb2.append(", ");
            sb2.append(this.f42292e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f42294n != null) {
            sb2.append(", ");
            sb2.append(this.f42294n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f7;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f42299y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof x3;
            g4 g4Var = this.f42290b;
            int i16 = 0;
            if (z11) {
                this.f42296s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f42299y;
                b3 q6 = i4.q(this.f42289a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f42290b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f42297w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f42299y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (g4Var.G) {
                    alignment2 = org.telegram.ui.Components.mx0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                b3 p5 = i4.p(this.f42289a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f42290b);
                this.f42294n = p5;
                if (p5 != null) {
                    i16 += this.f42294n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j3 = pageblockembedpost.author_photo_id;
                if (j3 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f42295r = z10;
                if (z10) {
                    TLRPC.Photo e7 = f4.e(g4Var.E, j3);
                    boolean z12 = e7 instanceof TLRPC.TL_photo;
                    this.f42295r = z12;
                    if (z12) {
                        String str = this.f42299y.author;
                        org.telegram.ui.Components.j9 j9Var = this.d;
                        j9Var.n(0L, str, null);
                        this.f42291c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e7.sizes, AndroidUtilities.dp(40.0f), true), e7), "40_40", j9Var, 0L, (String) null, g4Var.E, 1);
                    }
                }
                String str2 = this.f42299y.author;
                if (this.f42295r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f42299y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                b3 p10 = i4.p(this.f42289a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f42290b);
                this.f42293f = p10;
                if (p10 != null) {
                    if (this.f42295r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p10.f36115s = AndroidUtilities.dp(i14 + 32);
                    b3 b3Var = this.f42293f;
                    if (this.f42292e != null) {
                        f7 = 10.0f;
                    } else {
                        f7 = 19.0f;
                    }
                    b3Var.v = AndroidUtilities.dp(f7);
                }
                if (this.f42299y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f42299y.date * 1000);
                    if (this.f42295r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.f42292e = i4.q(this.f42289a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f42299y, this.f42290b);
                } else {
                    this.f42292e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f42299y.blocks.isEmpty()) {
                    this.f42296s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f42299y;
                    b3 q10 = i4.q(this.f42289a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f42290b);
                    this.h = q10;
                    if (q10 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f42297w = height2;
                        dp3 = org.telegram.messenger.q.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f42299y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (g4Var.G) {
                        alignment = org.telegram.ui.Components.mx0.a();
                    } else {
                        alignment = alignment3;
                    }
                    b3 p11 = i4.p(this.f42289a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f42290b);
                    this.f42294n = p11;
                    if (p11 != null) {
                        dp3 = this.f42294n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f42294n = null;
                }
                b3 b3Var2 = this.f42292e;
                if (b3Var2 != null) {
                    if (this.f42295r) {
                        i16 = 54;
                    }
                    b3Var2.f36115s = AndroidUtilities.dp(i16 + 32);
                    this.f42292e.v = AndroidUtilities.dp(29.0f);
                }
                b3 b3Var3 = this.h;
                if (b3Var3 != null) {
                    b3Var3.f36115s = this.f42296s;
                    b3Var3.v = this.v;
                }
                b3 b3Var4 = this.f42294n;
                if (b3Var4 != null) {
                    b3Var4.f36115s = this.f42296s;
                    b3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f42298x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f42289a, this.f42290b, motionEvent, this, this.h, this.f42296s, this.v)) {
            if (!i4.l(this.f42289a, this.f42290b, motionEvent, this, this.f42294n, this.f42296s, this.v + this.f42297w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f42299y = pageblockembedpost;
        requestLayout();
    }
}
