package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.net.URLDecoder;
import java.text.BreakIterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;

public final class h extends m41 {

    public static final int f43844a = 0;

    static {
        m41.setup(new h());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        FrameLayout.LayoutParams layoutParams;
        String string;
        String strV;
        String strDecode;
        Bitmap bitmap;
        boolean z11;
        String str;
        String string2;
        TLRPC.Photo photo;
        int i10;
        String strA;
        String strDecode2;
        String strP;
        Bitmap bitmap2;
        String str2;
        i iVar = (i) view;
        Object obj = n41Var.H;
        if (!(obj instanceof MessageObject)) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                CharSequence charSequence = n41Var.f30845m;
                String string3 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = iVar.d;
                c6 c6Var = iVar.f43852a;
                n9 n9Var = iVar.f43853b;
                TextView textView = iVar.f43856f;
                TextView textView2 = iVar.f43855e;
                iVar.d();
                String str3 = a1Var.f43776c;
                i2 i2Var = a1Var.d;
                try {
                    try {
                        if (i2Var == null || TextUtils.isEmpty(i2Var.f43868c)) {
                            if (i2Var == null || TextUtils.isEmpty(i2Var.d)) {
                                try {
                                    String[] strArrSplit = Uri.parse(str3).getHost().split("\\.");
                                    String str4 = strArrSplit[strArrSplit.length - 2];
                                    StringBuilder sb2 = new StringBuilder();
                                    layoutParams = layoutParams2;
                                    try {
                                        sb2.append(str4.substring(0, 1).toUpperCase());
                                        sb2.append(str4.substring(1));
                                        textView2.setText(sb2.toString());
                                    } catch (Exception unused) {
                                        textView2.setText("");
                                    }
                                } catch (Exception unused2) {
                                    layoutParams = layoutParams2;
                                }
                            } else {
                                textView2.setText(i2Var.d);
                            }
                            if (i2Var != null || (bitmap = i2Var.f43871i) == null) {
                                if (textView2.getText() == null) {
                                    string = "";
                                } else {
                                    string = textView2.getText().toString();
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(string);
                                dq dqVar = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string.isEmpty() ? "" : string.substring(characterInstance.first(), characterInstance.next()), 1));
                                int iDp = AndroidUtilities.dp(28.0f);
                                int iDp2 = AndroidUtilities.dp(28.0f);
                                dqVar.h = iDp;
                                dqVar.f27825n = iDp2;
                                n9Var.setImageDrawable(dqVar);
                            } else {
                                n9Var.setImageBitmap(bitmap);
                            }
                            iVar.f43857n.setVisibility(8);
                            Uri uri = Uri.parse(str3);
                            strV = we.e.v(uri, null, null, we.e.a(uri.getHost()), null);
                            strDecode = URLDecoder.decode(strV.replaceAll("\\+", "%2b"), "UTF-8");
                            textView.setText(strDecode);
                            if (!TextUtils.isEmpty(string3)) {
                                textView2.setText(AndroidUtilities.highlightText(textView2.getText(), string3, c6Var));
                                textView.setText(AndroidUtilities.highlightText(textView.getText(), string3, c6Var));
                            }
                            textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                            textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                            iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.f43775b));
                            iVar.f43858r.a(false, false);
                            FrameLayout.LayoutParams layoutParams3 = layoutParams;
                            layoutParams3.rightMargin = AndroidUtilities.dp(70.0f);
                            iVar.f43854c.setLayoutParams(layoutParams3);
                            iVar.f43860w = z10;
                            iVar.setWillNotDraw(!z10);
                            return;
                        }
                        textView2.setText(i2Var.f43868c);
                        Uri uri2 = Uri.parse(str3);
                        strV = we.e.v(uri2, null, null, we.e.a(uri2.getHost()), null);
                    } catch (Exception e9) {
                        try {
                            FileLog.e((Throwable) e9, false);
                            strV = str3;
                        } catch (Exception e10) {
                            e = e10;
                            strV = str3;
                            FileLog.e(e);
                            strDecode = strV;
                            textView.setText(strDecode);
                            if (!TextUtils.isEmpty(string3)) {
                                textView2.setText(AndroidUtilities.highlightText(textView2.getText(), string3, c6Var));
                                textView.setText(AndroidUtilities.highlightText(textView.getText(), string3, c6Var));
                            }
                            textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                            textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                            iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.f43775b));
                            iVar.f43858r.a(false, false);
                            FrameLayout.LayoutParams layoutParams4 = layoutParams;
                            layoutParams4.rightMargin = AndroidUtilities.dp(70.0f);
                            iVar.f43854c.setLayoutParams(layoutParams4);
                            iVar.f43860w = z10;
                            iVar.setWillNotDraw(!z10);
                            return;
                        }
                    }
                    strDecode = URLDecoder.decode(strV.replaceAll("\\+", "%2b"), "UTF-8");
                } catch (Exception e11) {
                    e = e11;
                    FileLog.e(e);
                    strDecode = strV;
                }
                layoutParams = layoutParams2;
                if (i2Var != null) {
                    if (textView2.getText() == null) {
                        string = "";
                    } else {
                        string = textView2.getText().toString();
                    }
                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                    characterInstance2.setText(string);
                    dq dqVar2 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string.isEmpty() ? "" : string.substring(characterInstance2.first(), characterInstance2.next()), 1));
                    int iDp3 = AndroidUtilities.dp(28.0f);
                    int iDp4 = AndroidUtilities.dp(28.0f);
                    dqVar2.h = iDp3;
                    dqVar2.f27825n = iDp4;
                    n9Var.setImageDrawable(dqVar2);
                } else {
                    if (textView2.getText() == null) {
                        string = "";
                    } else {
                        string = textView2.getText().toString();
                    }
                    BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                    characterInstance3.setText(string);
                    dq dqVar3 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string.isEmpty() ? "" : string.substring(characterInstance3.first(), characterInstance3.next()), 1));
                    int iDp5 = AndroidUtilities.dp(28.0f);
                    int iDp6 = AndroidUtilities.dp(28.0f);
                    dqVar3.h = iDp5;
                    dqVar3.f27825n = iDp6;
                    n9Var.setImageDrawable(dqVar3);
                }
                iVar.f43857n.setVisibility(8);
                textView.setText(strDecode);
                if (!TextUtils.isEmpty(string3)) {
                    textView2.setText(AndroidUtilities.highlightText(textView2.getText(), string3, c6Var));
                    textView.setText(AndroidUtilities.highlightText(textView.getText(), string3, c6Var));
                }
                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.f43775b));
                iVar.f43858r.a(false, false);
                FrameLayout.LayoutParams layoutParams5 = layoutParams;
                layoutParams5.rightMargin = AndroidUtilities.dp(70.0f);
                iVar.f43854c.setLayoutParams(layoutParams5);
                iVar.f43860w = z10;
                iVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        MessageObject messageObject = (MessageObject) obj;
        boolean z12 = n41Var.f30849q;
        CharSequence charSequence2 = n41Var.f30845m;
        String string4 = charSequence2 == null ? null : charSequence2.toString();
        boolean z13 = n41Var.f30838e;
        FrameLayout.LayoutParams layoutParams6 = iVar.d;
        c6 c6Var2 = iVar.f43852a;
        TextView textView3 = iVar.f43856f;
        n9 n9Var2 = iVar.f43853b;
        TextView textView4 = iVar.f43855e;
        iVar.d();
        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
        String strA2 = webPage != null ? webPage.url : l.a(messageObject);
        i2 i2VarA = j2.b().a(AndroidUtilities.getHostAuthority(strA2, true));
        try {
            try {
                if (webPage != null && (str2 = webPage.title) != null) {
                    textView4.setText(str2);
                } else if (webPage != null && (str = webPage.site_name) != null) {
                    textView4.setText(str);
                } else {
                    if (i2VarA == null || TextUtils.isEmpty(i2VarA.f43868c)) {
                        if (i2VarA == null || TextUtils.isEmpty(i2VarA.d)) {
                            try {
                                String[] strArrSplit2 = Uri.parse(strA2).getHost().split("\\.");
                                String str5 = strArrSplit2[strArrSplit2.length - 2];
                                StringBuilder sb3 = new StringBuilder();
                                z11 = z13;
                                try {
                                    sb3.append(str5.substring(0, 1).toUpperCase());
                                    sb3.append(str5.substring(1));
                                    textView4.setText(sb3.toString());
                                } catch (Exception unused3) {
                                    textView4.setText("");
                                }
                            } catch (Exception unused4) {
                                z11 = z13;
                            }
                        } else {
                            textView4.setText(i2VarA.d);
                        }
                        n9Var2.b();
                        if (i2VarA == null && (bitmap2 = i2VarA.f43871i) != null) {
                            n9Var2.setImageBitmap(bitmap2);
                        } else if (webPage != null || (photo = webPage.photo) == null) {
                            if (textView4.getText() == null) {
                                string2 = "";
                            } else {
                                string2 = textView4.getText().toString();
                            }
                            BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                            characterInstance4.setText(string2);
                            dq dqVar4 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string2.isEmpty() ? "" : string2.substring(characterInstance4.first(), characterInstance4.next()), 0));
                            int iDp7 = AndroidUtilities.dp(28.0f);
                            int iDp8 = AndroidUtilities.dp(28.0f);
                            dqVar4.h = iDp7;
                            dqVar4.f27825n = iDp8;
                            n9Var2.setImageDrawable(dqVar4);
                        } else {
                            n9Var2.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
                        }
                        iVar.h.setVisibility(8);
                        ImageView imageView = iVar.f43857n;
                        if (z12) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        imageView.setVisibility(i10);
                        if (webPage != null) {
                            strA = webPage.url;
                        } else {
                            strA = l.a(messageObject);
                        }
                        strDecode2 = strA;
                        Uri uri3 = Uri.parse(strDecode2);
                        strDecode2 = we.e.v(uri3, null, null, we.e.a(uri3.getHost()), null);
                        strDecode2 = URLDecoder.decode(strDecode2.replaceAll("\\+", "%2b"), "UTF-8");
                        strP = m3.p(strDecode2);
                        textView3.setText(strP);
                        if (!TextUtils.isEmpty(string4)) {
                            textView4.setText(AndroidUtilities.highlightText(textView4.getText(), string4, c6Var2));
                            textView3.setText(AndroidUtilities.highlightText(textView3.getText(), string4, c6Var2));
                        }
                        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                        iVar.f43858r.a(z11, false);
                        layoutParams6.rightMargin = AndroidUtilities.dp(52.0f);
                        iVar.f43854c.setLayoutParams(layoutParams6);
                        iVar.f43860w = z10;
                        iVar.setWillNotDraw(!z10);
                    }
                    textView4.setText(i2VarA.f43868c);
                }
                Uri uri4 = Uri.parse(strDecode2);
                strDecode2 = we.e.v(uri4, null, null, we.e.a(uri4.getHost()), null);
            } catch (Exception e12) {
                FileLog.e(e12);
                strP = strDecode2;
            }
        } catch (Exception e13) {
            FileLog.e((Throwable) e13, false);
        }
        z11 = z13;
        n9Var2.b();
        if (i2VarA == null) {
            if (webPage != null) {
                if (textView4.getText() == null) {
                    string2 = "";
                } else {
                    string2 = textView4.getText().toString();
                }
                BreakIterator characterInstance5 = BreakIterator.getCharacterInstance();
                characterInstance5.setText(string2);
                dq dqVar5 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string2.isEmpty() ? "" : string2.substring(characterInstance5.first(), characterInstance5.next()), 0));
                int iDp9 = AndroidUtilities.dp(28.0f);
                int iDp10 = AndroidUtilities.dp(28.0f);
                dqVar5.h = iDp9;
                dqVar5.f27825n = iDp10;
                n9Var2.setImageDrawable(dqVar5);
            } else {
                if (textView4.getText() == null) {
                    string2 = "";
                } else {
                    string2 = textView4.getText().toString();
                }
                BreakIterator characterInstance6 = BreakIterator.getCharacterInstance();
                characterInstance6.setText(string2);
                dq dqVar6 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string2.isEmpty() ? "" : string2.substring(characterInstance6.first(), characterInstance6.next()), 0));
                int iDp11 = AndroidUtilities.dp(28.0f);
                int iDp12 = AndroidUtilities.dp(28.0f);
                dqVar6.h = iDp11;
                dqVar6.f27825n = iDp12;
                n9Var2.setImageDrawable(dqVar6);
            }
        } else if (webPage != null) {
            if (textView4.getText() == null) {
                string2 = "";
            } else {
                string2 = textView4.getText().toString();
            }
            BreakIterator characterInstance7 = BreakIterator.getCharacterInstance();
            characterInstance7.setText(string2);
            dq dqVar7 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string2.isEmpty() ? "" : string2.substring(characterInstance7.first(), characterInstance7.next()), 0));
            int iDp13 = AndroidUtilities.dp(28.0f);
            int iDp14 = AndroidUtilities.dp(28.0f);
            dqVar7.h = iDp13;
            dqVar7.f27825n = iDp14;
            n9Var2.setImageDrawable(dqVar7);
        } else {
            if (textView4.getText() == null) {
                string2 = "";
            } else {
                string2 = textView4.getText().toString();
            }
            BreakIterator characterInstance8 = BreakIterator.getCharacterInstance();
            characterInstance8.setText(string2);
            dq dqVar8 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.f43859s)), new g(iVar, string2.isEmpty() ? "" : string2.substring(characterInstance8.first(), characterInstance8.next()), 0));
            int iDp15 = AndroidUtilities.dp(28.0f);
            int iDp16 = AndroidUtilities.dp(28.0f);
            dqVar8.h = iDp15;
            dqVar8.f27825n = iDp16;
            n9Var2.setImageDrawable(dqVar8);
        }
        iVar.h.setVisibility(8);
        ImageView imageView2 = iVar.f43857n;
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView2.setVisibility(i10);
        if (webPage != null) {
            strA = webPage.url;
        } else {
            strA = l.a(messageObject);
        }
        strDecode2 = strA;
        strDecode2 = URLDecoder.decode(strDecode2.replaceAll("\\+", "%2b"), "UTF-8");
        strP = m3.p(strDecode2);
        textView3.setText(strP);
        if (!TextUtils.isEmpty(string4)) {
            textView4.setText(AndroidUtilities.highlightText(textView4.getText(), string4, c6Var2));
            textView3.setText(AndroidUtilities.highlightText(textView3.getText(), string4, c6Var2));
        }
        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
        iVar.f43858r.a(z11, false);
        layoutParams6.rightMargin = AndroidUtilities.dp(52.0f);
        iVar.f43854c.setLayoutParams(layoutParams6);
        iVar.f43860w = z10;
        iVar.setWillNotDraw(!z10);
    }

    @Override
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.H == n41Var2.H && TextUtils.equals(n41Var.f30845m, n41Var2.f30845m);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.H == n41Var2.H && TextUtils.isEmpty(n41Var.f30845m) == TextUtils.isEmpty(n41Var2.f30845m);
    }
}
