package org.telegram.ui;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import rh.o;
public final class vg implements org.telegram.ui.Components.q4, org.telegram.ui.ActionBar.u1, t5.b, org.telegram.ui.Components.a40, s9.h, vh.l5 {
    public final int f42725a;
    public final long f42726b;
    public final Object f42727c;
    public final Object d;
    public final Object e;

    public vg(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f42725a = i10;
        this.f42727c = obj;
        this.f42726b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        un.w0((un) this.f42727c, (ArrayList) this.d, this.f42726b, (org.telegram.ui.Components.nl0) this.e, z10, i10);
    }

    @Override
    public void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        un unVar = (un) this.f42727c;
        TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) this.d;
        TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) this.e;
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            fileLocationArr[0] = photoSize2.location;
            fileLocationArr2[0] = photoSize.location;
            return;
        }
        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
        if (inputFile != null) {
            tL_photos_uploadProfilePhoto.file = inputFile;
            tL_photos_uploadProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadProfilePhoto.flags;
            tL_photos_uploadProfilePhoto.video_start_ts = d;
            tL_photos_uploadProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
            tL_photos_uploadProfilePhoto.flags |= 16;
        }
        unVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new org.telegram.messenger.voip.c(unVar, fileLocationArr, str, fileLocationArr2, this.f42726b));
    }

    @Override
    public ScheduledFuture a(final s9.g gVar) {
        switch (this.f42725a) {
            case 6:
                s9.f fVar = (s9.f) this.f42727c;
                return fVar.f48112b.schedule(new s9.d(fVar, (Runnable) this.d, gVar, 1), this.f42726b, (TimeUnit) this.e);
            default:
                final s9.f fVar2 = (s9.f) this.f42727c;
                final Callable callable = (Callable) this.d;
                return fVar2.f48112b.schedule(new Callable() {
                    @Override
                    public final Object call() {
                        return f.this.f48111a.submit(new o(19, callable, gVar));
                    }
                }, this.f42726b, (TimeUnit) this.e);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public Object g() {
        ea.d dVar = (ea.d) this.f42727c;
        Iterable iterable = (Iterable) this.d;
        l5.i iVar = (l5.i) this.e;
        s5.g gVar = (s5.g) ((s5.d) dVar.f6468c);
        gVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + s5.g.g(iterable);
            SQLiteDatabase a2 = gVar.a();
            a2.beginTransaction();
            try {
                a2.compileStatement(str).execute();
                Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    gVar.e(rawQuery.getInt(0), o5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                }
                rawQuery.close();
                a2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a2.setTransactionSuccessful();
            } finally {
                a2.endTransaction();
            }
        }
        gVar.c(new m4.x0(((u5.a) dVar.f6470g).g() + this.f42726b, iVar));
        return null;
    }

    @Override
    public gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f42725a) {
            case 1:
                org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) this.f42727c;
                Runnable runnable = (Runnable) this.e;
                boolean z10 = false;
                org.telegram.ui.Cells.c2 c2Var = ((org.telegram.ui.Cells.c2[]) this.d)[0];
                if (c2Var != null && c2Var.b()) {
                    z10 = true;
                }
                b50.y1(u3Var, z10, this.f42726b, runnable);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                ProfileActivity profileActivity = ((dx0) this.f42727c).f36859b;
                profileActivity.M1 = true;
                Bundle g10 = a1.g.g("scrollToTopOnResume", true);
                long j10 = -this.f42726b;
                g10.putLong("chat_id", j10);
                if (profileActivity.getMessagesController().E(g10, (ay) this.d, null, null)) {
                    un unVar = new un(g10);
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.getMessagesController().m(j10, user, 0, null, unVar, true, null, null, null);
                    profileActivity.presentFragment(unVar, true);
                    return;
                }
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.f42727c;
                mg.i2 i2Var = (mg.i2) this.e;
                e4Var.getClass();
                e4Var.r1(this.f42726b, ((TL_stars.starGiftDepositPayload[]) this.d)[0], x1Var.h(i10, true, true), i2Var);
                return;
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        vh.k4 k4Var = (vh.k4) this.f42727c;
        vh.n5 n5Var = (vh.n5) this.d;
        long j10 = this.f42726b;
        String str = (String) this.e;
        if (n5Var.K) {
            String str2 = n5Var.N;
            if (str2 != null) {
                return BitmapFactory.decodeFile(str2, options);
            }
            try {
                return MediaStore.Video.Thumbnails.getThumbnail(k4Var.getContext().getContentResolver(), j10, 1, options);
            } catch (Throwable unused) {
                k4Var.invalidate();
                return null;
            }
        }
        return BitmapFactory.decodeFile(str, options);
    }

    @Override
    public boolean x() {
        return false;
    }

    public vg(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f42725a = i10;
        this.f42727c = obj;
        this.d = obj2;
        this.f42726b = j10;
        this.e = obj3;
    }

    public vg(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f42725a = i10;
        this.f42727c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f42726b = j10;
    }

    @Override
    public void H(float f7) {
    }

    @Override
    public void T() {
    }

    @Override
    public void O(boolean z10, boolean z11) {
    }
}
