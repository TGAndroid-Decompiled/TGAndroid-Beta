package rh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class s4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String A;
    public String B;
    public TLRPC.InputFile C;
    public boolean D;

    public final int f47438a;

    public final String f47439b;

    public final boolean f47440c;
    public final boolean d;

    public final boolean f47441e;

    public final int f47442f;
    public final int h;

    public final int f47443n;

    public final TLRPC.Document f47444r;

    public final r4 f47445s;
    public boolean v;

    public boolean f47446w;

    public boolean f47447x;

    public int f47448y;

    public s4(int i10, String str, boolean z10, int i11, int i12, int i13, c3 c3Var) {
        this.f47438a = i10;
        this.f47439b = str;
        this.f47440c = z10;
        this.d = false;
        this.f47441e = false;
        this.f47442f = i11;
        this.h = i12;
        this.f47443n = i13;
        this.f47444r = null;
        this.f47445s = c3Var;
    }

    public final void a(String str) {
        int i10;
        if (this.f47446w || this.f47447x) {
            return;
        }
        this.A = str;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f47438a);
        notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
        if (this.f47440c) {
            i10 = 33554432;
        } else if (this.d) {
            i10 = 50331648;
        } else {
            i10 = this.f47441e ? 67108864 : 16777216;
        }
        FileLoader.getInstance(this.f47438a).uploadFile(this.A, false, (this.f47440c || this.d || this.f47441e) ? false : true, i10);
    }

    public final void b() {
        if (this.f47447x || this.f47446w) {
            return;
        }
        this.f47446w = true;
        try {
            if (this.A != null) {
                FileLoader.getInstance(this.f47438a).cancelFileUpload(this.A, false);
            }
        } catch (Throwable unused) {
        }
        if (this.f47448y != 0) {
            ConnectionsManager.getInstance(this.f47438a).cancelRequest(this.f47448y, true);
            this.f47448y = 0;
        }
        e();
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f47440c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f47443n;
            tL_documentAttributeVideo.f22387w = this.f47442f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f47441e;
            if (z10 || z11) {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f47444r;
                if (z11) {
                    str = "application/octet-stream";
                } else if (document == null || (str = document.mime_type) == null) {
                    str = "audio/mpeg";
                }
                tL_inputMediaUploadedDocument2.mime_type = str;
                if (document != null) {
                    if (z11) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                            i10++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                tL_inputMediaUploadedDocument2.attributes.add(documentAttribute2);
                            }
                        }
                    } else {
                        tL_inputMediaUploadedDocument2.attributes.addAll(document.attributes);
                    }
                }
                if (z11) {
                    tL_inputMediaUploadedDocument2.force_file = true;
                    if (inputFile2 != null) {
                        tL_inputMediaUploadedDocument2.thumb = inputFile2;
                        tL_inputMediaUploadedDocument2.flags |= 4;
                    }
                }
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument2;
            } else {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            }
        }
        this.f47448y = ConnectionsManager.getInstance(this.f47438a).sendRequest(tL_messages_uploadMedia, new cf.a(this, 29));
    }

    public final void d() {
        int i10;
        int i11;
        if (this.v || this.f47446w || this.f47447x) {
            return;
        }
        this.v = true;
        if (this.f47440c) {
            r4 r4Var = this.f47445s;
            int i12 = this.f47442f;
            if (i12 > 0 && (i11 = this.h) > 0) {
                r4Var.a(i12, i11);
            }
            a(this.f47439b);
            return;
        }
        if (this.f47441e) {
            Utilities.globalQueue.postRunnable(new q4(this, 0));
            return;
        }
        if (this.d) {
            a(this.f47439b);
            return;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(this.f47439b, options);
            int i13 = options.outWidth;
            if (i13 > 0 && (i10 = options.outHeight) > 0) {
                this.f47445s.a(i13, i10);
            }
        } catch (Exception unused) {
        }
        Utilities.globalQueue.postRunnable(new q4(this, 1));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputFile inputFile;
        if (i11 != this.f47438a || this.f47446w || this.f47447x) {
            return;
        }
        String str = (String) objArr[0];
        if (this.A == null || !this.A.equals(str)) {
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
            if (this.f47441e && !this.D && !TextUtils.isEmpty(this.B)) {
                this.C = inputFile2;
                this.D = true;
                this.A = this.B;
                FileLoader.getInstance(this.f47438a).uploadFile(this.A, false, true, 16777216);
                return;
            }
            if (this.f47441e && this.D) {
                c(this.C, inputFile2);
                return;
            } else {
                c(inputFile2, null);
                return;
            }
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            if (this.f47441e && this.D && (inputFile = this.C) != null) {
                c(inputFile, null);
                return;
            }
            this.f47447x = true;
            e();
            this.f47445s.onError();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged) {
            long jLongValue = ((Long) objArr[1]).longValue();
            long jLongValue2 = ((Long) objArr[2]).longValue();
            r4 r4Var = this.f47445s;
            if (this.D) {
                return;
            }
            r4Var.f(jLongValue2 > 0 ? jLongValue / jLongValue2 : 0.0f);
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f47438a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public s4(int i10, String str, TLRPC.Document document, a3 a3Var) {
        this.f47438a = i10;
        this.f47439b = str;
        this.f47440c = false;
        this.d = true;
        this.f47441e = false;
        this.f47442f = 0;
        this.h = 0;
        this.f47443n = 0;
        this.f47444r = document;
        this.f47445s = a3Var;
    }

    public s4(int i10, String str, TLRPC.Document document, z2 z2Var) {
        this.f47438a = i10;
        this.f47439b = str;
        this.f47440c = false;
        this.d = false;
        this.f47441e = true;
        this.f47442f = 0;
        this.h = 0;
        this.f47443n = 0;
        this.f47444r = document;
        this.f47445s = z2Var;
    }
}
