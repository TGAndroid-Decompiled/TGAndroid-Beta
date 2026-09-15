package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ya1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final w5 B0;
    public final ah.h C0;
    public final fh.d D0;
    public ka1 E;
    public final fh.d E0;
    public ka1 F;
    public final ah.c F0;
    public ua1 G;
    public v91 G0;
    public ka1 H;
    public final ArrayList H0;
    public ka1 I;
    public final RectF I0;
    public ka1 J;
    public final RectF J0;
    public ka1 K;
    public ka1 L;
    public ka1 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.eo R;
    public z91 S;
    public ah.n T;
    public s4.c0 U;
    public final LruCache V;
    public org.telegram.ui.Components.aj0 W;
    public da1 X;
    public w91 Y;
    public xa1 Z;
    public TLRPC.ChatFull f39795a;
    public ig.f f39796a0;
    public final long f39797b;
    public LinearLayout f39798b0;
    public boolean f39799c;
    public final boolean f39800c0;
    public ka1 d;
    public final boolean f39801d0;
    public ka1 e;
    public final boolean f39802e0;
    public ta1 f39803f;
    public long f39804f0;
    public long f39805g0;
    public ka1 h;
    public final org.telegram.ui.ActionBar.b2[] f39806h0;
    public ci.i1 f39807i0;
    public cc f39808j0;
    public je f39809k0;
    public final boolean f39810l0;
    public gh0 m0;
    public ka1 f39811n;
    public oh.b[] f39812n0;
    public int f39813o0;
    public final SparseIntArray f39814p0;
    public final SparseIntArray f39815q0;
    public ka1 f39816r;
    public final ArrayList f39817r0;
    public ka1 f39818s;
    public final ArrayList f39819s0;
    public final ArrayList f39820t0;
    public final ArrayList f39821u0;
    public ka1 v;
    public final ArrayList f39822v0;
    public ka1 f39823w;
    public boolean f39824w0;
    public ka1 f39825x;
    public boolean f39826x0;
    public ka1 f39827y;
    public la1 f39828y0;
    public ai.d9 f39829z0;

    public ya1(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.V = new LruCache(50);
        this.f39806h0 = new org.telegram.ui.ActionBar.b2[1];
        this.f39813o0 = -1;
        this.f39814p0 = new SparseIntArray();
        this.f39815q0 = new SparseIntArray();
        this.f39817r0 = new ArrayList();
        this.f39819s0 = new ArrayList();
        this.f39820t0 = new ArrayList();
        this.f39821u0 = new ArrayList();
        this.f39822v0 = new ArrayList();
        this.f39826x0 = true;
        this.B0 = new w5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.H0 = arrayList;
        RectF rectF = new RectF();
        this.I0 = rectF;
        RectF rectF2 = new RectF();
        this.J0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j3 = bundle.getLong("chat_id");
        this.f39797b = j3;
        this.f39800c0 = bundle.getBoolean("is_megagroup", false);
        this.f39801d0 = bundle.getBoolean("start_from_boosts", false);
        this.f39802e0 = bundle.getBoolean("start_from_monetization", false);
        this.f39810l0 = bundle.getBoolean("only_boosts", false);
        this.f39795a = getMessagesController().getChatFull(j3);
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.C0 = new ah.h(false);
            this.D0 = new fh.d(null);
            fh.d dVar = new fh.d(null);
            this.E0 = dVar;
            ah.c cVar2 = new ah.c(dVar);
            this.F0 = cVar2;
            cVar2.f425i = LiteMode.isEnabled(262144);
            return;
        }
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = new ah.c(cVar);
    }

    public static void U(ya1 ya1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ya1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ya1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new s91(ya1Var, arrayList, 0));
    }

    public static void V(ya1 ya1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = ya1Var.N;
        ArrayList arrayList6 = ya1Var.O;
        ArrayList arrayList7 = ya1Var.f39817r0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final ka1[] ka1VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            ka1 ka1Var = ka1VarArr[2];
            if (ka1Var != null) {
                ka1Var.f35103n = true;
            }
            ?? obj = new Object();
            com.google.firebase.messaging.t a2 = ta1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f37621o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f37622p = (String) a2.f7347b;
            obj.f37623q = (String) a2.e;
            obj.f37624r = ((Boolean) a2.f7348c).booleanValue();
            obj.f37625s = ((Boolean) a2.d).booleanValue();
            com.google.firebase.messaging.t a10 = ta1.a(tL_broadcastStats.reactions_per_story);
            obj.f37626t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f37627u = (String) a10.f7347b;
            obj.v = (String) a10.e;
            obj.f37628w = ((Boolean) a10.f7348c).booleanValue();
            obj.f37629x = ((Boolean) a10.d).booleanValue();
            com.google.firebase.messaging.t a11 = ta1.a(tL_broadcastStats.views_per_story);
            obj.f37630y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f37631z = (String) a11.f7347b;
            obj.A = (String) a11.e;
            obj.B = ((Boolean) a11.f7348c).booleanValue();
            obj.C = ((Boolean) a11.d).booleanValue();
            com.google.firebase.messaging.t a12 = ta1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f7347b;
            obj.F = (String) a12.e;
            obj.G = ((Boolean) a12.f7348c).booleanValue();
            obj.H = ((Boolean) a12.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f37610a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f37611b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f37612c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb2.append(str15);
                    sb2.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb3 = sb2.toString();
                    obj.f37612c = sb3 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb4.append(str14);
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f37612c = String.format(locale2, "%s (%.1f%s)", sb4.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f37615i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f37616j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb5.append(str13);
                    sb5.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb6 = sb5.toString();
                    obj.f37617k = sb6 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb7.append(str12);
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f37617k = String.format(locale4, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f37617k = "";
            }
            if (i14 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f37618l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f37613f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb8.append(str11);
                    sb8.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb9 = sb8.toString();
                    obj.f37614g = sb9 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb10.append(str10);
                    sb10.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f37614g = String.format(locale6, "%s (%.1f%s)", sb10.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f37614g = "";
            }
            if (i16 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f7 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f37619m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f7;
            if (f7 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f37620n = a4.a.m(i18, "%");
            } else {
                obj.f37620n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f7), "%");
            }
            ya1Var.f39803f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ya1Var.f39804f0 = tL_statsDateRangeDays.max_date * 1000;
            ya1Var.f39805g0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f38487a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    ya1Var.f39814p0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    ya1Var.f39820t0.add(obj2);
                    ya1Var.f39815q0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new s91(ya1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ya1Var.getMessagesStorage().getMessages(-ya1Var.f39797b, 0L, false, arrayList12.size(), ((va1) arrayList12.get(0)).b(), 0, 0, ya1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(ya1Var) {
                public final ya1 f37055b;

                {
                    this.f37055b = ya1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ya1 ya1Var2 = this.f37055b;
                            ya1Var2.getClass();
                            ka1[] ka1VarArr2 = ka1VarArr;
                            ya1Var2.d = ka1VarArr2[0];
                            ya1Var2.H = ka1VarArr2[1];
                            ya1Var2.I = ka1VarArr2[2];
                            ya1Var2.J = ka1VarArr2[3];
                            ya1Var2.K = ka1VarArr2[4];
                            ya1Var2.L = ka1VarArr2[5];
                            ya1Var2.e = ka1VarArr2[6];
                            ya1Var2.M = ka1VarArr2[7];
                            ya1Var2.g0(ka1VarArr2);
                            return;
                        default:
                            ya1 ya1Var3 = this.f37055b;
                            ya1Var3.getClass();
                            ka1[] ka1VarArr3 = ka1VarArr;
                            ya1Var3.f39816r = ka1VarArr3[0];
                            ya1Var3.h = ka1VarArr3[1];
                            ya1Var3.e = ka1VarArr3[2];
                            ya1Var3.f39811n = ka1VarArr3[3];
                            ya1Var3.d = ka1VarArr3[4];
                            ya1Var3.f39818s = ka1VarArr3[5];
                            ya1Var3.v = ka1VarArr3[6];
                            ya1Var3.f39823w = ka1VarArr3[7];
                            ya1Var3.f39825x = ka1VarArr3[8];
                            ya1Var3.f39827y = ka1VarArr3[9];
                            ya1Var3.E = ka1VarArr3[10];
                            ya1Var3.F = ka1VarArr3[11];
                            ya1Var3.g0(ka1VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final ka1[] ka1VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            ka1 ka1Var2 = ka1VarArr2[6];
            if (ka1Var2 != null) {
                ka1Var2.f35103n = true;
            }
            ka1 ka1Var3 = ka1VarArr2[7];
            if (ka1Var3 != null) {
                ka1Var3.f35104o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f37924a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f37925b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb11 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb11.append(str8);
                    sb11.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb12 = sb11.toString();
                    obj3.f37926c = sb12 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb13 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb13.append(str7);
                    sb13.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f37926c = String.format(locale9, "%s (%.1f%s)", sb13.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f37926c = "";
            }
            if (i24 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f37929i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f37930j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb14 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb14.append(str6);
                sb14.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb15 = sb14.toString();
                obj3.f37931k = sb15;
            } else {
                obj3.f37931k = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f37932l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f37933m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f37934n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb16 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb16.append(str5);
                sb16.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb17 = sb16.toString();
                obj3.f37935o = sb17;
            } else {
                obj3.f37935o = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f37936p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f37927f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb18 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb18.append(str4);
                sb18.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb19 = sb18.toString();
                obj3.f37928g = sb19;
            } else {
                obj3.f37928g = "";
            }
            if (i28 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            ya1Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ya1Var.f39804f0 = tL_statsDateRangeDays2.max_date * 1000;
            ya1Var.f39805g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f37064a = ra1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb20 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb20.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f37065b = sb20.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = ya1Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f37064a = ra1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb21 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb21.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb21.length() > 0) {
                            sb21.append(", ");
                        }
                        sb21.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f37065b = sb21.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ya1Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f37064a = ra1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f37065b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f37065b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(ya1Var) {
                public final ya1 f37055b;

                {
                    this.f37055b = ya1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ya1 ya1Var2 = this.f37055b;
                            ya1Var2.getClass();
                            ka1[] ka1VarArr22 = ka1VarArr2;
                            ya1Var2.d = ka1VarArr22[0];
                            ya1Var2.H = ka1VarArr22[1];
                            ya1Var2.I = ka1VarArr22[2];
                            ya1Var2.J = ka1VarArr22[3];
                            ya1Var2.K = ka1VarArr22[4];
                            ya1Var2.L = ka1VarArr22[5];
                            ya1Var2.e = ka1VarArr22[6];
                            ya1Var2.M = ka1VarArr22[7];
                            ya1Var2.g0(ka1VarArr22);
                            return;
                        default:
                            ya1 ya1Var3 = this.f37055b;
                            ya1Var3.getClass();
                            ka1[] ka1VarArr3 = ka1VarArr2;
                            ya1Var3.f39816r = ka1VarArr3[0];
                            ya1Var3.h = ka1VarArr3[1];
                            ya1Var3.e = ka1VarArr3[2];
                            ya1Var3.f39811n = ka1VarArr3[3];
                            ya1Var3.d = ka1VarArr3[4];
                            ya1Var3.f39818s = ka1VarArr3[5];
                            ya1Var3.v = ka1VarArr3[6];
                            ya1Var3.f39823w = ka1VarArr3[7];
                            ya1Var3.f39825x = ka1VarArr3[8];
                            ya1Var3.f39827y = ka1VarArr3[9];
                            ya1Var3.E = ka1VarArr3[10];
                            ya1Var3.F = ka1VarArr3[11];
                            ya1Var3.g0(ka1VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(ya1 ya1Var) {
        float f7;
        RectF rectF = ya1Var.J0;
        ah.h hVar = ya1Var.C0;
        if (Build.VERSION.SDK_INT >= 31 && hVar != null && ya1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (ya1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            ya1Var.I0.set(0.0f, -dp, ya1Var.fragmentView.getMeasuredWidth(), ya1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), ya1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            hVar.g(2, ya1Var.H0);
            hVar.e(ya1Var.G0, ya1Var.fragmentView.getMeasuredWidth(), ya1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(ya1 ya1Var) {
        View currentView = ya1Var.f39807i0.getCurrentView();
        cc ccVar = ya1Var.f39808j0;
        if (currentView == ccVar) {
            ya1Var.actionBar.setAdaptiveBackground(ccVar.F);
            return;
        }
        je jeVar = ya1Var.f39809k0;
        if (currentView == jeVar) {
            ya1Var.actionBar.setAdaptiveBackground(jeVar.f34860a1);
        } else {
            ya1Var.actionBar.setAdaptiveBackground(ya1Var.S);
        }
    }

    public static void Z(ya1 ya1Var) {
        xa1 xa1Var = ya1Var.Z;
        if (xa1Var != null) {
            xa1Var.f39564b = true;
        }
        int childCount = ya1Var.S.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ya1Var.S.getChildAt(i10);
            if (childAt instanceof ja1) {
                ((ja1) childAt).f34572b.f11162t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f18112id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f18112id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new ya1(bundle);
        }
        return new v5(-chat.f18112id);
    }

    public static jg.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new jg.b(jSONObject);
        }
        if (i10 == 1) {
            return new jg.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new jg.b(jSONObject);
            int length = ((jg.a) bVar.d.get(0)).f12992a.length;
            int size = bVar.d.size();
            bVar.f13007l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f13007l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f13007l;
                    jArr[i11] = jArr[i11] + ((jg.a) bVar.d.get(i12)).f12992a[i11];
                }
            }
            bVar.f13008m = new SegmentTree(bVar.f13007l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new jg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f12998a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j10 = ((jg.a) bVar2.d.get(i13)).f12992a[i14];
                        jArr2[i13] = jArr2[i13] + j10;
                        if (j10 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j3 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j3 < 0.01d && iArr[i15] > bVar2.f12998a.length / 2.0f) {
                        arrayList.add((jg.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((jg.a) obj);
                }
            }
            int length3 = ((jg.a) bVar2.d.get(0)).f12992a.length;
            int size3 = bVar2.d.size();
            bVar2.f13009l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f13009l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f13009l;
                    jArr3[i17] = jArr3[i17] + ((jg.a) bVar2.d.get(i18)).f12992a[i17];
                }
            }
            new SegmentTree(bVar2.f13009l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static ka1 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        ka1 ka1Var = new ka1(str, i10);
        ka1Var.f35102m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                jg.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                ka1Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                ka1Var.f35097g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f12998a) == null || jArr2.length < 2) {
                    ka1Var.f35101l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f12998a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    ka1Var.e = new jg.e(e02, j3);
                    ka1Var.f35095c = j3;
                    return ka1Var;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            ka1Var.f35096f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return ka1Var;
    }

    public static void k0(ka1 ka1Var, ArrayList arrayList, org.telegram.ui.ActionBar.j6 j6Var) {
        jg.b bVar;
        int i10;
        if (ka1Var != null && (bVar = ka1Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                jg.a aVar = (jg.a) obj;
                int i12 = aVar.f12996g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.i6.c1(i12)) {
                        int i13 = aVar.f12996g;
                        if (org.telegram.ui.ActionBar.i6.I == org.telegram.ui.ActionBar.i6.J) {
                            i10 = aVar.f12997i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.i6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.i6.nl[aVar.f12996g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, j6Var, aVar.f12996g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof ja1) {
            ((ja1) view).d();
        } else if (view instanceof org.telegram.ui.Cells.a7) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false)), org.telegram.ui.ActionBar.i6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f18800b7), 0, 0);
            pqVar.f27125w = true;
            view.setBackground(pqVar);
        } else if (view instanceof kg.c) {
            ((kg.c) view).a();
        } else if (view instanceof sa1) {
            int i10 = sa1.d;
            ((sa1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        gh0 gh0Var = this.m0;
        if (gh0Var != null) {
            gh0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f39799c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        z91 z91Var = this.S;
        if (z91Var != null) {
            z91Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        cc ccVar = this.f39808j0;
        if (ccVar != null) {
            ccVar.F.setPadding(0, currentActionBarHeight, 0, i13);
        }
        je jeVar = this.f39809k0;
        if (jeVar != null) {
            jeVar.f34860a1.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        boolean z12;
        int i10;
        float f7;
        String str;
        boolean z13;
        ya1 ya1Var = this;
        ya1Var.f39796a0 = new ig.f(null);
        MessagesController messagesController = MessagesController.getInstance(ya1Var.currentAccount);
        long j3 = ya1Var.f39797b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ya1Var.currentAccount).getChatFull(j3);
        if (chatFull != null && chatFull.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(oh.b.b(context, ya1Var.resourceProvider, oh.a.I, R.string.Statistics));
        }
        arrayList.add(oh.b.b(context, ya1Var.resourceProvider, oh.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(oh.b.b(context, ya1Var.resourceProvider, oh.a.MONETIZATION, R.string.Monetization));
        }
        ya1Var.f39812n0 = (oh.b[]) arrayList.toArray(new oh.b[0]);
        gh0 gh0Var = new gh0(context, ya1Var.resourceProvider);
        ya1Var.m0 = gh0Var;
        gh0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = ya1Var.f39812n0;
            if (i11 >= bVarArr.length) {
                break;
            }
            oh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ci.o4(ya1Var, i11, 25));
            ya1Var.m0.addView(ya1Var.f39812n0[i11]);
            ya1Var.m0.i(bVar, true, false);
            i11++;
        }
        ya1Var.f39807i0 = new ci.i1(ya1Var, ya1Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            ya1Var.f39808j0 = new cc(ya1Var, -j3, ya1Var.getResourceProvider());
        }
        if (z11) {
            Activity parentActivity = ya1Var.getParentActivity();
            int i12 = ya1Var.currentAccount;
            long j10 = -j3;
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            frameLayout = frameLayout2;
            je jeVar = new je(parentActivity, this, i12, j10, resourceProvider, z13, chatFull.can_view_stars_revenue);
            ya1Var = this;
            ya1Var.f39809k0 = jeVar;
            jeVar.setActionBar(ya1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z14 = z10;
        FrameLayout frameLayout3 = frameLayout;
        ya1Var.f39807i0.setAdapter(new y91(ya1Var, z14, isBoostSupported, z11, frameLayout3));
        boolean z15 = ya1Var.f39810l0;
        if (isBoostSupported && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        ya1Var.f39799c = z12;
        if (z12 && ya1Var.f39801d0) {
            ya1Var.f39807i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && ya1Var.f39802e0) {
            ci.i1 i1Var = ya1Var.f39807i0;
            if (!z15 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            i1Var.setPosition((z14 ? 1 : 0) + i10);
        }
        ya1Var.m0(ya1Var.f39807i0.getCurrentPosition(), false);
        w8 w8Var = new w8(ya1Var, ya1Var.getParentActivity(), 8);
        ya1Var.actionBar.setDrawBlurBackground(w8Var);
        w8Var.setBackgroundColor(ya1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7));
        hh.k kVar = new hh.k(w8Var);
        ah.c cVar = ya1Var.F0;
        cVar.f423f = kVar;
        cVar.f424g = w8Var;
        w8Var.addView(ya1Var.f39807i0, w7.x5.g());
        w8Var.addView(ya1Var.actionBar);
        if (ya1Var.f39799c) {
            w8Var.addView(ya1Var.m0, w7.x5.e(344, 72, 81));
            ya1Var.setBulletinDelegate(new ci.d9(12));
        }
        ya1Var.fragmentView = w8Var;
        z91 z91Var = new z91(ya1Var, context);
        ya1Var.S = z91Var;
        z91Var.setSections(true);
        ya1Var.S.setClipToPadding(false);
        z91 z91Var2 = ya1Var.S;
        Objects.requireNonNull(z91Var2);
        ya1Var.T = new ah.n(z91Var2, w8Var, new xs(z91Var2, 1));
        cc ccVar = ya1Var.f39808j0;
        if (ccVar != null) {
            org.telegram.ui.Components.ll0 ll0Var = ccVar.F;
            Objects.requireNonNull(ll0Var);
            ccVar.G = new ah.n(ll0Var, w8Var, new xs(ll0Var, 0));
            ya1Var.f39808j0.F.j(new x91(ya1Var, 1));
        }
        je jeVar2 = ya1Var.f39809k0;
        if (jeVar2 != null) {
            org.telegram.ui.Components.e61 e61Var = jeVar2.f34860a1;
            Objects.requireNonNull(e61Var);
            jeVar2.f34861b1 = new ah.n(e61Var, w8Var, new v8(e61Var, 0));
            ya1Var.f39809k0.f34860a1.j(new x91(ya1Var, 2));
        }
        ya1Var.G0 = new v91(ya1Var, w8Var);
        ya1Var.S.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        ya1Var.f39798b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        ya1Var.W = imageView;
        imageView.setAutoRepeat(true);
        ya1Var.W.f(R.raw.statistic_preload, 120, 120, null);
        ya1Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.wl.k(R.string.LoadingStatsDescription, textView2, 1);
        ya1Var.f39798b0.addView(ya1Var.W, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        ya1Var.f39798b0.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        ya1Var.f39798b0.addView(textView2, w7.x5.q(-2, -2, 1));
        frameLayout3.addView(ya1Var.f39798b0, w7.x5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ya1Var.X == null) {
            ya1Var.X = new da1(ya1Var);
        }
        ya1Var.S.setAdapter(ya1Var.X);
        s4.c0 c0Var = new s4.c0();
        ya1Var.U = c0Var;
        ya1Var.S.setLayoutManager(c0Var);
        ya1Var.Y = new s4.j();
        ya1Var.S.setItemAnimator(null);
        ya1Var.S.j(new x91(ya1Var, 0));
        ya1Var.S.setOnItemClickListener(new z21(ya1Var, 6));
        ya1Var.S.setOnItemLongClickListener(new tl0(ya1Var, 18));
        frameLayout3.addView(ya1Var.S);
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, null);
        ya1Var.R = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ya1Var.R.getAvatarImageView().setScaleX(0.9f);
        ya1Var.R.getAvatarImageView().setScaleY(0.9f);
        ya1Var.R.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar2 = ya1Var.actionBar;
        org.telegram.ui.Components.eo eoVar2 = ya1Var.R;
        if (!ya1Var.inPreviewMode) {
            f7 = 50.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(eoVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = ya1Var.getMessagesController().getChat(Long.valueOf(j3));
        ya1Var.R.setChatAvatar(chat2);
        org.telegram.ui.Components.eo eoVar3 = ya1Var.R;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        eoVar3.setTitle(str);
        org.telegram.ui.Components.eo eoVar4 = ya1Var.R;
        if (eoVar4.getSubtitleTextView() != null) {
            eoVar4.getSubtitleTextView().setVisibility(8);
        }
        hg.k0.x(false, ya1Var.actionBar);
        ya1Var.actionBar.setActionBarMenuOnItemClick(new v81(ya1Var, 1));
        ya1Var.R.i(org.telegram.ui.ActionBar.i6.w0(null, i13, false), org.telegram.ui.ActionBar.i6.w0(null, i14, false));
        ya1Var.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i13, false), false);
        ya1Var.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i13, false), true);
        ya1Var.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19239z8, false), false);
        ya1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
        boolean z16 = ya1Var.f39826x0;
        w5 w5Var = ya1Var.B0;
        if (z16) {
            ya1Var.f39798b0.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            ya1Var.f39798b0.setVisibility(0);
            ya1Var.S.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            ya1Var.f39798b0.setVisibility(8);
            ya1Var.S.setVisibility(0);
        }
        ch.d c10 = cVar.c(ya1Var.m0, eh.b.f(ya1Var.resourceProvider), false);
        c10.q(AndroidUtilities.dp(28.0f));
        c10.p(AndroidUtilities.dp(7.666f));
        ya1Var.m0.setBackground(c10);
        ya1Var.c0();
        ya1Var.f39828y0 = new la1(ya1Var.X, ya1Var.U);
        return ya1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.n2 n2Var2;
        org.telegram.ui.ActionBar.n2 n2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((ai.d9) objArr[0]) == this.f39829z0) {
                j0();
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f39828y0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, fragmentStack);
                } else {
                    n2Var = null;
                }
                if (n2Var instanceof wo) {
                    ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    n2Var2 = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, fragmentStack2);
                } else {
                    n2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        n2Var3 = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(3, fragmentStack2);
                    }
                    if (n2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
                    }
                    finishFragment();
                    if (n2Var3 instanceof bo) {
                        tg.k.f(n2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    tg.k.f(n2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f39817r0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.f39814p0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((va1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((va1) arrayList.get(i14));
                        } else {
                            ((va1) arrayList.get(i14)).f38488b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f39819s0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    va1 va1Var = (va1) arrayList.get(i12);
                    if (va1Var.f38488b == null) {
                        this.f39813o0 = va1Var.b();
                        break;
                    } else {
                        arrayList4.add(va1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.X != null) {
                    this.S.setItemAnimator(null);
                    this.f39828y0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18113id == this.f39797b && this.f39795a == null) {
                this.f39795a = chatFull;
                i0();
            }
        }
    }

    public final void g0(ka1[] ka1VarArr) {
        da1 da1Var = this.X;
        if (da1Var != null) {
            da1Var.E();
            this.S.setItemAnimator(null);
            this.X.l();
        }
        this.f39826x0 = false;
        LinearLayout linearLayout = this.f39798b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.B0);
            this.f39798b0.animate().alpha(0.0f).setDuration(230L).setListener(new cr0(this, 21));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (ka1 ka1Var : ka1VarArr) {
                if (ka1Var != null && ka1Var.d == null && ka1Var.f35096f != null) {
                    ka1Var.a(this.currentAccount, this.classGuid, this.f39795a.stats_dc, new org.telegram.ui.Components.s51(1, this, ka1Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.j5 j5Var;
        ka1 ka1Var;
        ka1 ka1Var2;
        wy0 wy0Var = new wy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.i6.f18780a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.i6.f18943j5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{org.telegram.ui.Cells.c8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 0, new Class[]{kg.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f18907h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f18836d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f19237z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f19239z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f18800b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.f19201x6));
        int i13 = org.telegram.ui.ActionBar.i6.f19056p7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, i13));
        org.telegram.ui.Components.eo eoVar = this.R;
        if (eoVar != null) {
            j5Var = eoVar.getTitleTextView();
        } else {
            j5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(j5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.Oi));
        org.telegram.ui.Components.eo eoVar2 = this.R;
        if (eoVar2 != null) {
            view2 = eoVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.i6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19001m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19148u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19166v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.f39800c0) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    ka1Var2 = this.d;
                } else if (i14 == 1) {
                    ka1Var2 = this.H;
                } else if (i14 == 2) {
                    ka1Var2 = this.I;
                } else if (i14 == 3) {
                    ka1Var2 = this.J;
                } else if (i14 == 4) {
                    ka1Var2 = this.K;
                } else {
                    ka1Var2 = this.L;
                }
                k0(ka1Var2, arrayList, wy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    ka1Var = this.d;
                } else if (i15 == 1) {
                    ka1Var = this.h;
                } else if (i15 == 2) {
                    ka1Var = this.f39811n;
                } else if (i15 == 3) {
                    ka1Var = this.f39816r;
                } else if (i15 == 4) {
                    ka1Var = this.f39818s;
                } else if (i15 == 5) {
                    ka1Var = this.v;
                } else if (i15 == 6) {
                    ka1Var = this.f39825x;
                } else if (i15 == 7) {
                    ka1Var = this.e;
                } else if (i15 == 8) {
                    ka1Var = this.f39823w;
                } else if (i15 == 9) {
                    ka1Var = this.f39827y;
                } else if (i15 == 10) {
                    ka1Var = this.E;
                } else {
                    ka1Var = this.F;
                }
                k0(ka1Var, arrayList, wy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f18150id = new ArrayList<>();
        ArrayList arrayList = this.f39817r0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f39814p0.get(this.f39813o0); i11 < size; i11++) {
            if (((va1) arrayList.get(i11)).f38488b == null) {
                tL_channels_getMessages.f18150id.add(Integer.valueOf(((va1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f39797b);
        this.f39824w0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new u91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f39810l0) {
            return;
        }
        boolean z10 = this.f39800c0;
        long j3 = this.f39797b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new u91(this, 1), null, null, 0, this.f39795a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ci.i1 i1Var = this.f39807i0;
        if (i1Var != null && (i1Var.f24957b != 0 || i1Var.f24958c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f39821u0;
        arrayList.clear();
        ArrayList arrayList2 = this.f39820t0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            va1 va1Var = (va1) obj;
            MessageObject f7 = this.f39829z0.f(va1Var.b());
            if (f7 != null) {
                va1Var.f38488b = f7;
                arrayList.add(va1Var);
            }
        }
        this.f39815q0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f39812n0;
            if (i11 < bVarArr.length) {
                oh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.f39812n0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            oh.b bVar = this.f39812n0[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.m0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f39822v0;
        arrayList.clear();
        arrayList.addAll(this.f39819s0);
        arrayList.addAll(this.f39821u0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        ai.l9 storiesController = getMessagesController().getStoriesController();
        long j3 = this.f39797b;
        ai.d9 A = storiesController.A(-j3, 2, -1, true);
        this.f39829z0 = A;
        if (A != null) {
            this.A0 = A.o();
        }
        if (this.f39795a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j3, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.f39806h0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        ai.d9 d9Var = this.f39829z0;
        if (d9Var != null) {
            d9Var.z(this.A0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
