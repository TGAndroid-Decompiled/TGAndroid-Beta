package qh;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class r4 implements NotificationCenter.NotificationCenterDelegate {
    public volatile String A;
    public String B;
    public TLRPC.InputFile C;
    public boolean D;
    public final int f46653a;
    public final String f46654b;
    public final boolean f46655c;
    public final boolean d;
    public final boolean f46656e;
    public final int f46657f;
    public final int h;
    public final int f46658n;
    public final TLRPC.Document f46659r;
    public final q4 f46660s;
    public boolean v;
    public boolean f46661w;
    public boolean f46662x;
    public int f46663y;

    public r4(int i9, String str, boolean z10, int i10, int i11, int i12, b3 b3Var) {
        this.f46653a = i9;
        this.f46654b = str;
        this.f46655c = z10;
        this.d = false;
        this.f46656e = false;
        this.f46657f = i10;
        this.h = i11;
        this.f46658n = i12;
        this.f46659r = null;
        this.f46660s = b3Var;
    }

    public final void a(String str) {
        int i9;
        boolean z10;
        if (!this.f46661w && !this.f46662x) {
            this.A = str;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46653a);
            notificationCenter.addObserver(this, NotificationCenter.fileUploaded);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadFailed);
            notificationCenter.addObserver(this, NotificationCenter.fileUploadProgressChanged);
            if (this.f46655c) {
                i9 = 33554432;
            } else if (this.d) {
                i9 = 50331648;
            } else if (this.f46656e) {
                i9 = 67108864;
            } else {
                i9 = 16777216;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.f46653a);
            String str2 = this.A;
            if (!this.f46655c && !this.d && !this.f46656e) {
                z10 = true;
            } else {
                z10 = false;
            }
            fileLoader.uploadFile(str2, false, z10, i9);
        }
    }

    public final void b() {
        if (!this.f46662x && !this.f46661w) {
            this.f46661w = true;
            try {
                if (this.A != null) {
                    FileLoader.getInstance(this.f46653a).cancelFileUpload(this.A, false);
                }
            } catch (Throwable unused) {
            }
            if (this.f46663y != 0) {
                ConnectionsManager.getInstance(this.f46653a).cancelRequest(this.f46663y, true);
                this.f46663y = 0;
            }
            e();
        }
    }

    public final void c(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2) {
        String str;
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        if (this.f46655c) {
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_inputMediaUploadedDocument.file = inputFile;
            tL_inputMediaUploadedDocument.mime_type = "video/mp4";
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
            tL_documentAttributeVideo.supports_streaming = true;
            tL_documentAttributeVideo.duration = this.f46658n;
            tL_documentAttributeVideo.f22387w = this.f46657f;
            tL_documentAttributeVideo.h = this.h;
            tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        } else {
            boolean z10 = this.d;
            boolean z11 = this.f46656e;
            if (!z10 && !z11) {
                TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                tL_inputMediaUploadedPhoto.file = inputFile;
                tL_messages_uploadMedia.media = tL_inputMediaUploadedPhoto;
            } else {
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument2 = new TLRPC.TL_inputMediaUploadedDocument();
                tL_inputMediaUploadedDocument2.file = inputFile;
                TLRPC.Document document = this.f46659r;
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
                        int i9 = 0;
                        while (i9 < size) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i9);
                            i9++;
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
            }
        }
        this.f46663y = ConnectionsManager.getInstance(this.f46653a).sendRequest(tL_messages_uploadMedia, new bf.a(this, 29));
    }

    public final void d() {
        int i9;
        int i10;
        if (!this.v && !this.f46661w && !this.f46662x) {
            this.v = true;
            if (this.f46655c) {
                q4 q4Var = this.f46660s;
                int i11 = this.f46657f;
                if (i11 > 0 && (i10 = this.h) > 0) {
                    q4Var.a(i11, i10);
                }
                a(this.f46654b);
            } else if (this.f46656e) {
                Utilities.globalQueue.postRunnable(new p4(this, 0));
            } else if (this.d) {
                a(this.f46654b);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.f46654b, options);
                    int i12 = options.outWidth;
                    if (i12 > 0 && (i9 = options.outHeight) > 0) {
                        this.f46660s.a(i12, i9);
                    }
                } catch (Exception unused) {
                }
                Utilities.globalQueue.postRunnable(new p4(this, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        float f10;
        TLRPC.InputFile inputFile;
        if (i10 == this.f46653a && !this.f46661w && !this.f46662x) {
            String str = (String) objArr[0];
            if (this.A != null && this.A.equals(str)) {
                if (i9 == NotificationCenter.fileUploaded) {
                    TLRPC.InputFile inputFile2 = (TLRPC.InputFile) objArr[1];
                    if (this.f46656e && !this.D && !TextUtils.isEmpty(this.B)) {
                        this.C = inputFile2;
                        this.D = true;
                        this.A = this.B;
                        FileLoader.getInstance(this.f46653a).uploadFile(this.A, false, true, 16777216);
                    } else if (this.f46656e && this.D) {
                        c(this.C, inputFile2);
                    } else {
                        c(inputFile2, null);
                    }
                } else if (i9 == NotificationCenter.fileUploadFailed) {
                    if (this.f46656e && this.D && (inputFile = this.C) != null) {
                        c(inputFile, null);
                        return;
                    }
                    this.f46662x = true;
                    e();
                    this.f46660s.onError();
                } else if (i9 == NotificationCenter.fileUploadProgressChanged) {
                    long longValue = ((Long) objArr[1]).longValue();
                    long longValue2 = ((Long) objArr[2]).longValue();
                    q4 q4Var = this.f46660s;
                    if (!this.D) {
                        if (longValue2 > 0) {
                            f10 = ((float) longValue) / ((float) longValue2);
                        } else {
                            f10 = 0.0f;
                        }
                        q4Var.f(f10);
                    }
                }
            }
        }
    }

    public final void e() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f46653a);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploaded);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadFailed);
        notificationCenter.removeObserver(this, NotificationCenter.fileUploadProgressChanged);
    }

    public r4(int i9, String str, TLRPC.Document document, z2 z2Var) {
        this.f46653a = i9;
        this.f46654b = str;
        this.f46655c = false;
        this.d = true;
        this.f46656e = false;
        this.f46657f = 0;
        this.h = 0;
        this.f46658n = 0;
        this.f46659r = document;
        this.f46660s = z2Var;
    }

    public r4(int i9, String str, TLRPC.Document document, y2 y2Var) {
        this.f46653a = i9;
        this.f46654b = str;
        this.f46655c = false;
        this.d = false;
        this.f46656e = true;
        this.f46657f = 0;
        this.h = 0;
        this.f46658n = 0;
        this.f46659r = document;
        this.f46660s = y2Var;
    }
}
