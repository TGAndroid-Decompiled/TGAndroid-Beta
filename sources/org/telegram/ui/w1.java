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
public final class w1 extends View implements org.telegram.ui.Cells.m9 {
    public final a70 f43624a;
    public final j4 f43625b;
    public final ImageReceiver f43626c;
    public final org.telegram.ui.Components.z8 d;
    public e3 f43627e;
    public e3 f43628f;
    public e3 h;
    public e3 f43629n;
    public boolean f43630r;
    public int f43631s;
    public int v;
    public int f43632w;
    public int f43633x;
    public TL_iv.pageBlockEmbedPost f43634y;

    public w1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f43624a = a70Var;
        this.f43625b = j4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f43626c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f43628f;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.f43627e;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            arrayList.add(e3Var3);
        }
        e3 e3Var4 = this.f43629n;
        if (e3Var4 != null) {
            arrayList.add(e3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f43628f;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.f43627e;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            e3Var3.attach(this);
        }
        e3 e3Var4 = this.f43629n;
        if (e3Var4 != null) {
            e3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f43628f;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.f43627e;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
        e3 e3Var3 = this.h;
        if (e3Var3 != null) {
            e3Var3.detach(this);
        }
        e3 e3Var4 = this.f43629n;
        if (e3Var4 != null) {
            e3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i9;
        int i10;
        float f10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f43634y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof a4;
            a70 a70Var = this.f43624a;
            int i11 = 0;
            if (!z10) {
                if (this.f43630r) {
                    this.f43626c.draw(canvas);
                }
                int i12 = 54;
                if (this.f43628f != null) {
                    canvas.save();
                    if (this.f43630r) {
                        i10 = 54;
                    } else {
                        i10 = 0;
                    }
                    float dp = AndroidUtilities.dp(i10 + 32);
                    if (this.f43627e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f10));
                    l4.v(a70Var, canvas, this, 0);
                    this.f43628f.draw(canvas, this);
                    canvas.restore();
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                if (this.f43627e != null) {
                    canvas.save();
                    if (!this.f43630r) {
                        i12 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i12 + 32), AndroidUtilities.dp(29.0f));
                    l4.v(a70Var, canvas, this, i9);
                    this.f43627e.draw(canvas, this);
                    canvas.restore();
                    i9++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i13 = this.f43633x;
                if (this.f43634y.level == 0) {
                    i11 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i13 - i11, l4.f39999m1);
                i11 = i9;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f43631s, this.v);
                l4.v(a70Var, canvas2, this, i11);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i11++;
            }
            if (this.f43629n != null) {
                canvas2.save();
                canvas2.translate(this.f43631s, this.v + this.f43632w);
                l4.v(a70Var, canvas2, this, i11);
                this.f43629n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f43628f != null) {
            sb2.append(", ");
            sb2.append(this.f43628f.d.getText());
        }
        if (this.f43627e != null) {
            sb2.append(", ");
            sb2.append(this.f43627e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f43629n != null) {
            sb2.append(", ");
            sb2.append(this.f43629n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        Layout.Alignment alignment;
        int i12;
        int i13;
        float f10;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i9);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f43634y;
        int i14 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof a4;
            j4 j4Var = this.f43625b;
            int i15 = 0;
            if (z11) {
                this.f43631s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f43634y;
                e3 q10 = l4.q(this.f43624a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f43625b);
                this.h = q10;
                if (q10 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f43632w = height;
                    i15 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f43634y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (j4Var.C) {
                    alignment2 = org.telegram.ui.Components.rv0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                e3 p6 = l4.p(this.f43624a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f43625b);
                this.f43629n = p6;
                if (p6 != null) {
                    i15 += this.f43629n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i14 = i15;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f43630r = z10;
                if (z10) {
                    TLRPC.Photo e10 = i4.e(j4Var.A, j10);
                    boolean z12 = e10 instanceof TLRPC.TL_photo;
                    this.f43630r = z12;
                    if (z12) {
                        String str = this.f43634y.author;
                        org.telegram.ui.Components.z8 z8Var = this.d;
                        z8Var.n(0L, str, null);
                        this.f43626c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.dp(40.0f), true), e10), "40_40", z8Var, 0L, (String) null, j4Var.A, 1);
                    }
                }
                String str2 = this.f43634y.author;
                if (this.f43630r) {
                    i11 = 54;
                } else {
                    i11 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i11 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f43634y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                e3 p9 = l4.p(this.f43624a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f43625b);
                this.f43628f = p9;
                if (p9 != null) {
                    if (this.f43630r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    p9.f37805s = AndroidUtilities.dp(i13 + 32);
                    e3 e3Var = this.f43628f;
                    if (this.f43627e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    e3Var.v = AndroidUtilities.dp(f10);
                }
                if (this.f43634y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f43634y.date * 1000);
                    if (this.f43630r) {
                        i12 = 54;
                    } else {
                        i12 = 0;
                    }
                    this.f43627e = l4.q(this.f43624a, this, format, null, size - AndroidUtilities.dp(i12 + 50), AndroidUtilities.dp(29.0f), this.f43634y, this.f43625b);
                } else {
                    this.f43627e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f43634y.blocks.isEmpty()) {
                    this.f43631s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f43634y;
                    e3 q11 = l4.q(this.f43624a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f43625b);
                    this.h = q11;
                    if (q11 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f43632w = height2;
                        dp3 = org.telegram.messenger.l0.C(4.0f, height2, dp3);
                    }
                    int i16 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f43634y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (j4Var.C) {
                        alignment = org.telegram.ui.Components.rv0.a();
                    } else {
                        alignment = alignment3;
                    }
                    e3 p10 = l4.p(this.f43624a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f43625b);
                    this.f43629n = p10;
                    if (p10 != null) {
                        dp3 = this.f43629n.d.getHeight() + AndroidUtilities.dp(4.0f) + i16;
                    } else {
                        dp3 = i16;
                    }
                } else {
                    this.h = null;
                    this.f43629n = null;
                }
                e3 e3Var2 = this.f43627e;
                if (e3Var2 != null) {
                    if (this.f43630r) {
                        i15 = 54;
                    }
                    e3Var2.f37805s = AndroidUtilities.dp(i15 + 32);
                    this.f43627e.v = AndroidUtilities.dp(29.0f);
                }
                e3 e3Var3 = this.h;
                if (e3Var3 != null) {
                    e3Var3.f37805s = this.f43631s;
                    e3Var3.v = this.v;
                }
                e3 e3Var4 = this.f43629n;
                if (e3Var4 != null) {
                    e3Var4.f37805s = this.f43631s;
                    e3Var4.v = this.v;
                }
                i14 = dp3;
            }
            this.f43633x = i14;
        }
        setMeasuredDimension(size, i14);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f43624a, this.f43625b, motionEvent, this, this.h, this.f43631s, this.v)) {
            if (!l4.l(this.f43624a, this.f43625b, motionEvent, this, this.f43629n, this.f43631s, this.v + this.f43632w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f43634y = pageblockembedpost;
        requestLayout();
    }
}
