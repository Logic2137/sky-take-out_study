每次启动nginx：
sudo nginx -p $(pwd) -c conf/nginx.conf

停止服务重启：
sudo systemctl stop nginx  # 停止系统服务
sudo pkill -9 nginx        # 强制杀死所有存余的 nginx 进程
