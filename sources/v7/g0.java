package v7;

import android.net.Uri;
public abstract class g0 {
    public static int a(String str) {
        char c10;
        if (str == null) {
            return -1;
        }
        String n10 = b2.r0.n(str);
        n10.getClass();
        switch (n10.hashCode()) {
            case -2123537834:
                if (n10.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384011:
                if (n10.equals("video/mp2p")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1662384007:
                if (n10.equals("video/mp2t")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1662095187:
                if (n10.equals("video/webm")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (n10.equals("audio/amr-wb")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case -1487656890:
                if (n10.equals("image/avif")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case -1487464693:
                if (n10.equals("image/heic")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case -1487464690:
                if (n10.equals("image/heif")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case -1487394660:
                if (n10.equals("image/jpeg")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case -1487018032:
                if (n10.equals("image/webp")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case -1248337486:
                if (n10.equals("application/mp4")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case -1079884372:
                if (n10.equals("video/x-msvideo")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case -1004728940:
                if (n10.equals("text/vtt")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case -879272239:
                if (n10.equals("image/bmp")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case -879258763:
                if (n10.equals("image/png")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case -387023398:
                if (n10.equals("audio/x-matroska")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case -43467528:
                if (n10.equals("application/webm")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 13915911:
                if (n10.equals("video/x-flv")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (n10.equals("audio/ac3")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 187078297:
                if (n10.equals("audio/ac4")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 187078669:
                if (n10.equals("audio/amr")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 187090232:
                if (n10.equals("audio/mp4")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 187091926:
                if (n10.equals("audio/ogg")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 187099443:
                if (n10.equals("audio/wav")) {
                    c10 = 23;
                    break;
                }
                c10 = 65535;
                break;
            case 1331848029:
                if (n10.equals("video/mp4")) {
                    c10 = 24;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (n10.equals("audio/3gpp")) {
                    c10 = 25;
                    break;
                }
                c10 = 65535;
                break;
            case 1504578661:
                if (n10.equals("audio/eac3")) {
                    c10 = 26;
                    break;
                }
                c10 = 65535;
                break;
            case 1504619009:
                if (n10.equals("audio/flac")) {
                    c10 = 27;
                    break;
                }
                c10 = 65535;
                break;
            case 1504824762:
                if (n10.equals("audio/midi")) {
                    c10 = 28;
                    break;
                }
                c10 = 65535;
                break;
            case 1504831518:
                if (n10.equals("audio/mpeg")) {
                    c10 = 29;
                    break;
                }
                c10 = 65535;
                break;
            case 1505118770:
                if (n10.equals("audio/webm")) {
                    c10 = 30;
                    break;
                }
                c10 = 65535;
                break;
            case 2039520277:
                if (n10.equals("video/x-matroska")) {
                    c10 = 31;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    public static int b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
